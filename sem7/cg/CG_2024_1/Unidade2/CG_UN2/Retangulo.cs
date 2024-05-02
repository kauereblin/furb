#define CG_Debug

using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;

namespace gcgcg
{
    internal class Retangulo : Objeto
    {
        public Retangulo(Objeto _paiRef, ref char _rotulo) : this(_paiRef, ref _rotulo, new Ponto4D(-0.5, -0.5), new Ponto4D(0.5, 0.5))
        {

        }

        public Retangulo(Objeto _paiRef, ref char _rotulo, Ponto4D ptoInfEsq, Ponto4D ptoSupDir) : base(_paiRef, ref _rotulo)
        {
            PrimitivaTipo = PrimitiveType.TriangleFan;
            PrimitivaTamanho = 10;

            // Sentido horário
            AdicionarPonto(ptoInfEsq);
            AdicionarPonto(new Ponto4D(ptoSupDir.X, ptoInfEsq.Y));
            AdicionarPonto(ptoSupDir);
            AdicionarPonto(new Ponto4D(ptoInfEsq.X, ptoSupDir.Y));
            Atualizar();
        }

        public override void Atualizar()
        {
            if (PrimitivaTipo == PrimitiveType.Points)
                PrimitivaTipo = PrimitiveType.Lines;
            else if (PrimitivaTipo == PrimitiveType.Lines)
                PrimitivaTipo = PrimitiveType.LineLoop;
            else if (PrimitivaTipo == PrimitiveType.LineLoop)
                PrimitivaTipo = PrimitiveType.LineStrip;
            else if (PrimitivaTipo == PrimitiveType.LineStrip)
                PrimitivaTipo = PrimitiveType.Triangles;
            else if (PrimitivaTipo == PrimitiveType.Triangles)
                PrimitivaTipo = PrimitiveType.TriangleStrip;
            else if (PrimitivaTipo == PrimitiveType.TriangleStrip)
                PrimitivaTipo = PrimitiveType.TriangleFan;
            else if (PrimitivaTipo == PrimitiveType.TriangleFan)
                PrimitivaTipo = PrimitiveType.Points;

            ObjetoAtualizar();
        }

#if CG_Debug
        public override string ToString()
        {
            string retorno;
            retorno = "__ Objeto Retangulo _ Tipo: " + PrimitivaTipo + " _ Tamanho: " + PrimitivaTamanho + "\n";
            retorno += ImprimeToString();
            return (retorno);
        }
#endif

    }
}
