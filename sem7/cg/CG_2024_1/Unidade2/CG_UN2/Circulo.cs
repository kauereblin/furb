using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;

namespace gcgcg
{
    internal class Circulo : Objeto
    {
        public double raio;
        public Ponto4D pontoDeslocamento;
        public Circulo(Objeto _paiRef, ref char _rotulo, double _raio, Ponto4D _pontoDeslocamento) : base(_paiRef, ref _rotulo)
        {
            PrimitivaTipo = PrimitiveType.LineLoop;
            pontoDeslocamento = _pontoDeslocamento;
            PrimitivaTamanho = 5;
            raio = _raio;
            shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderAmarela.frag");

            for (int angulo = 0; angulo <= 360; angulo += 5)
                AdicionarPonto(Matematica.GerarPtosCirculo(angulo, raio) + pontoDeslocamento);

            Atualizar(_pontoDeslocamento);
        }

        public void Atualizar(Ponto4D _pontoDeslocamento)
        {
            pontosLista.Clear();
            for (int angulo = 0; angulo <= 360; angulo += 5)
                AdicionarPonto(Matematica.GerarPtosCirculo(angulo, raio) + _pontoDeslocamento);

            ObjetoAtualizar();
        }

        public override string ToString()
        {
            string retorno;
            retorno = "__ Objeto Circulo _ Tipo: " + PrimitivaTipo + " _ Raio: " + raio + "\n";
            retorno += ImprimeToString();
            return (retorno);
        }
    }
}
