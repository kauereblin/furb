using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;
using OpenTK.Windowing.GraphicsLibraryFramework;
using System;

namespace gcgcg
{
    internal class Box : Objeto
    {
        private Circulo circuloMaior;
        private Retangulo retangulo;
        private Circulo circuloMenor;
        private Ponto ponto;
        public Box(Objeto _paiRef, ref char _rotulo) : base(_paiRef, ref _rotulo)
        {
            ponto = new Ponto(_paiRef, ref _rotulo, new Ponto4D(0, 0));
            ponto.PrimitivaTamanho = 4;
            
            circuloMenor = new Circulo(_paiRef, ref _rotulo, 0.1, new Ponto4D(0, 0));
            circuloMenor.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderBranca.frag");
            circuloMenor.AdicionarFilho(ponto);
            
            retangulo = new Retangulo(_paiRef, ref _rotulo, new Ponto4D(-0.175, -0.175), new Ponto4D(0.175, 0.175));
            retangulo.PrimitivaTipo = PrimitiveType.LineLoop;
            retangulo.AdicionarFilho(circuloMenor);
            
            circuloMaior = new Circulo(_paiRef, ref _rotulo, 0.25, new Ponto4D(0, 0));
            circuloMaior.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderBranca.frag");
            circuloMaior.AdicionarFilho(retangulo);

            pontosLista.Add(new Ponto4D(0, 0));

            Atualizar();
        }

        public override void AlterarPonto(Keys key)
        {
            if (Matematica.distancia(ponto.GetPonto(0), new Ponto4D(0, 0)) >= circuloMaior.raio)
                return;

            switch (key)
            {
                case Keys.C:
                {
                    if (Matematica.distancia(ponto.GetPonto(0) + new Ponto4D(0, 0.02), new Ponto4D(0, 0)) < circuloMaior.raio)
                        ponto.AlterarPonto(ponto.GetPonto(0) + new Ponto4D(0, 0.02), 0);
                    circuloMenor.Atualizar(ponto.GetPonto(0));
                }
                break;

                case Keys.B:
                {
                    if (Matematica.distancia(ponto.GetPonto(0) + new Ponto4D(0, -0.02), new Ponto4D(0, 0)) < circuloMaior.raio)
                        ponto.AlterarPonto(ponto.GetPonto(0) + new Ponto4D(0, -0.02), 0);
                    circuloMenor.Atualizar(ponto.GetPonto(0));
                }
                break;

                case Keys.D:
                {
                    if (Matematica.distancia(ponto.GetPonto(0) + new Ponto4D(0.02, 0), new Ponto4D(0, 0)) < circuloMaior.raio)
                        ponto.AlterarPonto(ponto.GetPonto(0) + new Ponto4D(0.02, 0), 0);
                    circuloMenor.Atualizar(ponto.GetPonto(0));
                }
                break;

                case Keys.E:
                {
                    if (Matematica.distancia(ponto.GetPonto(0) + new Ponto4D(-0.02, 0), new Ponto4D(0, 0)) < circuloMaior.raio)
                        ponto.AlterarPonto(ponto.GetPonto(0) + new Ponto4D(-0.02, 0), 0);
                    circuloMenor.Atualizar(ponto.GetPonto(0));
                }
                break;
            }

            if ((ponto.GetPonto(0).X <= retangulo.GetPonto(0).X) || (ponto.GetPonto(0).X >= retangulo.GetPonto(1).X) ||
                (ponto.GetPonto(0).Y <= retangulo.GetPonto(0).Y) || (ponto.GetPonto(0).Y >= retangulo.GetPonto(2).Y))
            {
                retangulo.PrimitivaTipo = PrimitiveType.Points;
            }
            else
            {
                retangulo.PrimitivaTipo = PrimitiveType.LineLoop;
            }
        }

        public void Atualizar()
        {
            ObjetoAtualizar();
        }

        public override string ToString()
        {
            string retorno;
            retorno = "__ Objeto Circulo _ Tipo: " + PrimitivaTipo + "\n";
            retorno += ImprimeToString();
            return (retorno);
        }
    }
}
