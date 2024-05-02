using System;

namespace CG_Biblioteca
{
    /// <summary>
    /// Classe com funções matemáticas.
    /// </summary>
    public abstract class Matematica
    {
        /// <summary>
        /// Função para calcular um ponto sobre o perímetro de um círculo informando um ângulo e raio.
        /// </summary>
        /// <param name="angulo"></param>
        /// <param name="raio"></param>
        /// <returns></returns>
        public static Ponto4D GerarPtosCirculo(double angulo, double raio)
        {
            Ponto4D pto = new Ponto4D();
            pto.X = raio * Math.Cos(Math.PI * angulo / 180.0);
            pto.Y = raio * Math.Sin(Math.PI * angulo / 180.0);
            pto.Z = 0;
            return (pto);
        }

        public static double GerarPtosCirculoSimetrico(double raio)
        {
            return raio * Math.Cos(Math.PI * 45 / 180.0);
        }

        public static bool Dentro(BBox bBox, Ponto4D pto)
        {
            if (pto.X >= bBox.ObterMenorX && pto.X <= bBox.ObterMaiorX &&
                pto.Y >= bBox.ObterMenorY && pto.Y <= bBox.ObterMaiorY &&
                pto.Z >= bBox.ObterMenorZ && pto.Z <= bBox.ObterMaiorZ)
            {
                return true;
            }
            return false;
        }

        // Distância Euclidiana sem a Raiz
        public static double distanciaQuadrado(Ponto4D ptoA, Ponto4D ptoB)
        {
            return Math.Pow(ptoB.X - ptoA.X, 2) + Math.Pow(ptoB.Y - ptoA.Y, 2);
        }

        // Distância Euclidiana
        public static double distancia(Ponto4D ptoA, Ponto4D ptoB)
        {
            return Math.Sqrt(distanciaQuadrado(ptoA, ptoB));
        }

        public static double ScanLineInterseccao(double yi, double y1, double y2)
        {
            return (yi - y1) / (y2 - y1);
        }

        public static double ScanLineCalculaXi(double x1, double x2, double ti)
        {
            return x1 + (x2 - x1) * ti;
        }

        //TODO: não implementado os casos especiais
        public static bool ScanLine(Ponto4D ptoClique, Ponto4D ptoIni, Ponto4D ptoFim)
        {
            double ti = ScanLineInterseccao(ptoClique.Y, ptoIni.Y, ptoFim.Y);
            if (ti >= 0 && ti <= 1)    // lado do polígono (segmento) Intersecciona a ScanLine
            {
                double xi = ScanLineCalculaXi(ptoIni.X, ptoFim.X, ti);
                if (xi > ptoClique.X)
                    return true;
            }
            return false;
        }
    }
}