#define CG_Debug

using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;
using OpenTK.Windowing.GraphicsLibraryFramework;

namespace gcgcg
{
    internal class SrPalito : Objeto
    {
        private double raio;
        private double angulo;

        public SrPalito(Objeto _paiRef, ref char _rotulo) : base(_paiRef, ref _rotulo)
        {
            PrimitivaTamanho = 1;
            pontosLista.Add(new Ponto4D(0, 0));
            raio = 0.5;
            angulo = 45;
            pontosLista.Add(Matematica.GerarPtosCirculo(angulo, raio));

            ObjetoAtualizar();
        }

        public override void AlterarPonto(Keys key)
        {
            switch (key)
            {
                case Keys.Q:
                    AtualizarPe(-0.05);
                    break;
                case Keys.W:
                    AtualizarPe(0.05);
                    break;
                case Keys.A:
                    AtualizarRaio(-0.05);
                    break;
                case Keys.S:
                    AtualizarRaio(0.05);
                    break;
                case Keys.Z:
                    AtualizarAngulo(-2);
                    break;
                case Keys.X:
                    AtualizarAngulo(2);
                    break;
            }
        }

        public override void Atualizar()
        {
            ObjetoAtualizar();
        }

        public void AtualizarPe(double peInc)
        {
            pontosLista[0].X += peInc;
            pontosLista[1] = Matematica.GerarPtosCirculo(angulo, raio) + pontosLista[0];

            ObjetoAtualizar();
        }

        public void AtualizarRaio(double raioInc)
        {
            raio += raioInc;
            pontosLista[1] = Matematica.GerarPtosCirculo(angulo, raio) + pontosLista[0];

            ObjetoAtualizar();
        }

        public void AtualizarAngulo(double anguloInc)
        {
            angulo += anguloInc;
            pontosLista[1] = Matematica.GerarPtosCirculo(angulo, raio) + pontosLista[0];

            ObjetoAtualizar();
        }

#if CG_Debug
        public override string ToString()
        {
            string retorno;
            retorno = "__ Objeto Sr Palito _ Tipo: " + PrimitivaTipo + " _ Tamanho: " + PrimitivaTamanho + "\n";
            retorno += ImprimeToString();
            return (retorno);
        }
#endif
    }
}
