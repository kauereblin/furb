using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;
using OpenTK.Windowing.GraphicsLibraryFramework;
using System.Collections.Generic;

namespace gcgcg
{
    internal class Spline : Objeto
    {
        private IList<Ponto> pontoSelecionados;
        private IList<Ponto4D> pontos;
        private Ponto4D pontoSelecionado;

        private Ponto4D A;
        private Ponto4D B;
        private Ponto4D C;
        private Ponto4D D;

        private SegReta AB;
        private SegReta BC;
        private SegReta CD;

        private int indexPonto;
        private double inc;

        public Spline(Objeto _paiRef, ref char _rotulo, Objeto objetoFilho = null) : base(_paiRef, ref _rotulo, objetoFilho)
        {
            PrimitivaTipo = PrimitiveType.LineStrip;
            shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderAmarela.frag");
            PrimitivaTamanho = 20;
            indexPonto = 3;
            inc = 0.1;

            A = new Ponto4D(-0.5, -0.5);
            B = new Ponto4D(-0.5, 0.5);
            C = new Ponto4D(0.5, 0.5);
            D = new Ponto4D(0.5, -0.5);

            pontos = [A, B, C, D];

            // Para imprimir na tela
            pontoSelecionados = [
                new Ponto(this, ref _rotulo, A),
                new Ponto(this, ref _rotulo, B),
                new Ponto(this, ref _rotulo, C),
                new Ponto(this, ref _rotulo, D)];
            pontoSelecionado = pontos[indexPonto];

            AB = new SegReta(this, ref _rotulo);
            BC = new SegReta(this, ref _rotulo);
            CD = new SegReta(this, ref _rotulo);

            AB.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderCiano.frag");
            BC.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderCiano.frag");
            CD.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderCiano.frag");

            Atualizar();
        }

        public Ponto4D PegarPrimeiroPonto()
        {
            // Para espelhar aplicacao exemplo o primeiro ponto deve ser o que esta na direita inferior
            return pontos[3];
        }


        public void PegarProximoPonto()
        {
            if (indexPonto <= 0) indexPonto = 4;

            pontoSelecionado = pontos[--indexPonto];
            Atualizar();
        }

        public void AtualizarPontoSelecionado()
        {
            pontos[indexPonto] = pontoSelecionado;
            Atualizar();
        }

        public void AtualizarInc(double inc)
        {
            this.inc += inc;
            Atualizar();
        }

        IList<Ponto4D> CalcularPontosSpline()
        {
            IList<Ponto4D> pontosSpline = [A];
            for (double i = inc; i < 1; i += inc)
            {
                pontosSpline.Add(CalcularPontoSplineTempo(pontos, i));
            }
            pontosSpline.Add(D);
            return pontosSpline;
        }

        Ponto4D CalcularPontoSplineTempo(IList<Ponto4D> pontos4D, double tempo)
        {
            if (pontos4D.Count == 1) return pontos4D[0];

            IList<Ponto4D> pontosIntermediarios = [];

            for (int i = 1; i < pontos4D.Count; i++)
            {
                pontosIntermediarios.Add(PontoIntermediario(pontos4D[i - 1], pontos4D[i], tempo));
            }
            return CalcularPontoSplineTempo(pontosIntermediarios, tempo);
        }

        Ponto4D PontoIntermediario(Ponto4D pontoA, Ponto4D pontoB, double tempo)
        {
            double X = pontoA.X + (pontoB.X - pontoA.X) * tempo;
            double Y = pontoA.Y + (pontoB.Y - pontoA.Y) * tempo;
            return new Ponto4D(X, Y);
        }

        public override void AlterarPonto(Keys key)
        {
            switch (key)
            {
                case Keys.Space:
                    PegarProximoPonto();
                    break;

                case Keys.C:
                {
                    pontoSelecionado.Y += 0.1;
                    AtualizarPontoSelecionado();
                }
                break;

                case Keys.B:
                {
                    pontoSelecionado.Y -= 0.1;
                    AtualizarPontoSelecionado();
                }
                break;

                case Keys.E:
                {
                    pontoSelecionado.X -= 0.1;
                    AtualizarPontoSelecionado();
                }
                break;

                case Keys.D:
                {
                    pontoSelecionado.X += 0.1;
                    AtualizarPontoSelecionado();
                }
                break;

                case Keys.Equal:
                    AtualizarInc(0.01);
                    break;

                case Keys.Comma:
                    AtualizarInc(-0.01);
                    break;
            }
        }

        void Atualizar()
        {
            for (int i = 0; i < pontoSelecionados.Count; i++)
            {
                if (indexPonto == i)
                {
                    pontoSelecionados[i].AlterarPonto(pontos[i], 0);
                    pontoSelecionados[i].shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderVermelha.frag");
                }
                else
                {
                    pontoSelecionados[i].shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderBranca.frag");
                }
            }

            AB.AlterarPonto(A, 0);
            AB.AlterarPonto(B, 1);
            BC.AlterarPonto(B, 0);
            BC.AlterarPonto(C, 1);
            CD.AlterarPonto(C, 0);
            CD.AlterarPonto(D, 1);

            pontosLista.Clear();
            pontosLista.AddRange(CalcularPontosSpline());
            ObjetoAtualizar();
        }
    }
}
