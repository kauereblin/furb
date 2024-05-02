using System;

namespace CG_Biblioteca
{
    public abstract class Utilitario
    {
        public static char CharProximo(char atual)
        {
            return Convert.ToChar(atual + 1);
        }

        public static char TeclaUpperConsole(String msg, ref bool Control, ref bool Shift)
        {
            Console.WriteLine(msg);
            ConsoleKeyInfo input = Console.ReadKey(true);

            if ((input.Modifiers & ConsoleModifiers.Control) == ConsoleModifiers.Control)
            {
                Control = true;
            }
            else
            {
                if ((input.Modifiers & ConsoleModifiers.Shift) == ConsoleModifiers.Shift)
                {
                    Shift = true;
                }
            }
            return Char.ToUpper(input.Key.ToString()[0]);
        }

        // Coordenada de Dispositivo Normalizado (Normalized Device Coordinate - NDC)
        // Sistema de coordenadas de exibição independente das coordenadas de tela
        // Converte coordenada do ponto do espaço de tela para o espaço gráfico
        public static Ponto4D NDC_TelaSRU(int largura, int altura, Ponto4D mousePosition)
        {
            var x = 2 * (mousePosition.X / largura) - 1;
            var y = 2 * (-mousePosition.Y / altura) + 0.911;
            return new Ponto4D(x, y);
        }

        public static void AjudaTeclado()
        {
            Console.WriteLine(" --- Ajuda / Teclas: ");
            Console.WriteLine(" [H] mostra está ajuda. ");
            Console.WriteLine(" [Escape] sair. ");
            Console.WriteLine(" [Barra de Espaço] imprimir Grafo de Cena. "); //TODO: quais teclas irei usar.
        }

    }
}