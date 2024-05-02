#define CG_Debug

using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;

namespace gcgcg
{
    internal class Ponto : Objeto
    {
        public Ponto(Objeto _paiRef, ref char _rotulo) : this(_paiRef, ref _rotulo, new Ponto4D())
        {

        }

        public Ponto(Objeto _paiRef, ref char _rotulo, Ponto4D pto) : base(_paiRef, ref _rotulo)
        {
            PrimitivaTipo = PrimitiveType.Points;
            PrimitivaTamanho = 20;

            base.AdicionarPonto(pto);

            Atualizar();
        }

        public void Atualizar()
        {
            ObjetoAtualizar();
        }

#if CG_Debug
        public override string ToString()
        {
            string retorno;
            retorno = "__ Objeto Ponto _ Tipo: " + PrimitivaTipo + " _ Tamanho: " + PrimitivaTamanho + "\n";
            retorno += base.ImprimeToString();
            return (retorno);
        }
#endif

    }
}
