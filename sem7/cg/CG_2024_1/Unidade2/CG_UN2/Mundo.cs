//TODO: testar se estes DEFINEs continuam funcionado
#define CG_Gizmo  // debugar gráfico.
#define CG_OpenGL // render OpenGL.
// #define CG_DirectX // render DirectX.
// #define CG_Privado // código do professor.

using CG_Biblioteca;
using OpenTK.Graphics.OpenGL4;
using OpenTK.Windowing.Common;
using OpenTK.Windowing.GraphicsLibraryFramework;
using OpenTK.Windowing.Desktop;
using System;
using System.Collections.Generic;
using System.Numerics;
// using OpenTK.Mathematics;

namespace gcgcg
{
    public class Mundo : GameWindow
    {
        private static Objeto mundo = null;

        private char rotuloAtual = '?';
        private Objeto objetoSelecionado = null;

        private readonly float[] _sruEixos =
        {
            -0.0f,  0.0f,  0.0f, /* X- */     0.5f,  0.0f,  0.0f, /* X+ */
            0.0f, -0.0f,  0.0f, /* Y- */      0.0f,  0.5f,  0.0f, /* Y+ */
            0.0f,  0.0f, -0.5f, /* Z- */      0.0f,  0.0f,  0.5f, /* Z+ */
        };

        private int _vertexBufferObject_sruEixos;
        private int _vertexArrayObject_sruEixos;

        private Shader _shaderVermelha;
        private Shader _shaderVerde;
        private Shader _shaderAzul;

        private bool mouseMovtoPrimeiro = true;
        private Ponto4D mouseMovtoUltimo;
        //private Vector2 _lastPos;

        public Mundo(GameWindowSettings gameWindowSettings, NativeWindowSettings nativeWindowSettings)
               : base(gameWindowSettings, nativeWindowSettings)
        {
            mundo ??= new Objeto(null, ref rotuloAtual); //padrão Singleton
        }

        protected override void OnLoad()
        {
            base.OnLoad();

            GL.ClearColor(0.0f, 0.0f, 0.0f, 1.0f);

            #region Eixos: SRU  
            _vertexBufferObject_sruEixos = GL.GenBuffer();
            GL.BindBuffer(BufferTarget.ArrayBuffer, _vertexBufferObject_sruEixos);
            GL.BufferData(BufferTarget.ArrayBuffer, _sruEixos.Length * sizeof(float), _sruEixos, BufferUsageHint.StaticDraw);
            _vertexArrayObject_sruEixos = GL.GenVertexArray();
            GL.BindVertexArray(_vertexArrayObject_sruEixos);
            GL.VertexAttribPointer(0, 3, VertexAttribPointerType.Float, false, 3 * sizeof(float), 0);
            GL.EnableVertexAttribArray(0);
            _shaderVermelha = new Shader("Shaders/shader.vert", "Shaders/shaderVermelha.frag");
            _shaderVerde = new Shader("Shaders/shader.vert", "Shaders/shaderVerde.frag");
            _shaderAzul = new Shader("Shaders/shader.vert", "Shaders/shaderAzul.frag");
            #endregion

            //#region Objeto: polígono qualquer  
            //List<Ponto4D> pontosPoligono =
            //[
            //    new Ponto4D(0.25, 0.25),
            //    new Ponto4D(0.75, 0.25),
            //    new Ponto4D(0.75, 0.75),
            //    new Ponto4D(0.50, 0.50),
            //    new Ponto4D(0.25, 0.75),
            //];
            //objetoSelecionado = new Poligono(mundo, ref rotuloAtual, pontosPoligono);
            //#endregion

            //#region NÃO USAR: declara um objeto filho ao polígono
            //objetoSelecionado = new Ponto(objetoSelecionado, ref rotuloAtual, new Ponto4D(0.50, 0.75));
            //objetoSelecionado.ToString();
            //#endregion

            //#region Objeto: retângulo  
            //objetoSelecionado = new Retangulo(mundo, ref rotuloAtual, new Ponto4D(-0.25, 0.25), new Ponto4D(-0.75, 0.75));
            //objetoSelecionado.PrimitivaTipo = PrimitiveType.LineLoop;
            //#endregion

            //#region Objeto: segmento de reta  
            //objetoSelecionado = new SegReta(mundo, ref rotuloAtual, new Ponto4D(-0.25, -0.25), new Ponto4D(-0.75, -0.75));
            //#endregion

            //#region Objeto: ponto  
            //objetoSelecionado = new Ponto(mundo, ref rotuloAtual, new Ponto4D(0.25, -0.25));
            //objetoSelecionado.PrimitivaTipo = PrimitiveType.Points;
            //objetoSelecionado.PrimitivaTamanho = 10;
            //#endregion

            //#region 1. Circulo  
            //objetoSelecionado = new Circulo(mundo, ref rotuloAtual, 0.5, new Ponto4D(0, 0));
            //objetoSelecionado.PrimitivaTipo = PrimitiveType.Points;
            //#endregion

            //#region 2. Primitivas geométricas
            //objetoSelecionado = new Retangulo(mundo, ref rotuloAtual, new Ponto4D(0.5, -0.5), new Ponto4D(-0.5, 0.5));
            //objetoSelecionado.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderMagenta.frag");
            //#endregion

            //#region 3. SrPalito  
            //objetoSelecionado = new SrPalito(mundo, ref rotuloAtual);
            //#endregion

            //#region 4. Spline
            //objetoSelecionado = new Spline(mundo, ref rotuloAtual);
            //#endregion

            #region 5. BBox dos Círculos
            objetoSelecionado = new Box(mundo, ref rotuloAtual);
            #endregion
#if CG_Privado
             #region Objeto: circulo - origem
             objetoSelecionado = new Circulo(mundo, ref rotuloAtual, 0.2);
             objetoSelecionado.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderAmarela.frag");
             #endregion
             #region Objeto: circulo
             objetoSelecionado = new Circulo(mundo, ref rotuloAtual, 0.1, new Ponto4D(0.0,-0.5));
             objetoSelecionado.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderAmarela.frag");
             #endregion

             #region Objeto: SrPalito  
             objetoSelecionado = new SrPalito(mundo, ref rotuloAtual);
             #endregion

             #region Objeto: Spline
             objetoSelecionado = new Spline(mundo, ref rotuloAtual);
             #endregion
#endif

        }

        protected override void OnRenderFrame(FrameEventArgs e)
        {
            base.OnRenderFrame(e);

            GL.Clear(ClearBufferMask.ColorBufferBit);

#if CG_Gizmo
            Sru3D();
#endif
            mundo.Desenhar();
            SwapBuffers();
        }

        protected override void OnUpdateFrame(FrameEventArgs e)
        {
            base.OnUpdateFrame(e);

            #region Teclado
            var input = KeyboardState;
            if (input.IsKeyPressed(Keys.Escape))
            {
                Close();
            }
            else
            {
                if (input.IsKeyPressed(Keys.Q))
                {
                    objetoSelecionado.AlterarPonto(Keys.Q);
                }
                else if (input.IsKeyPressed(Keys.W))
                {
                    objetoSelecionado.AlterarPonto(Keys.W);
                }
                else if (input.IsKeyPressed(Keys.S))
                {
                    objetoSelecionado.AlterarPonto(Keys.S);
                }
                else if (input.IsKeyPressed(Keys.D))
                {

                    objetoSelecionado.AlterarPonto(Keys.D);
                }
                else if (input.IsKeyPressed(Keys.A))
                {
                    objetoSelecionado.AlterarPonto(Keys.A);
                }
                else if (input.IsKeyPressed(Keys.Z))
                {
                    objetoSelecionado.AlterarPonto(Keys.Z);
                }
                else if (input.IsKeyPressed(Keys.X))
                {
                    objetoSelecionado.AlterarPonto(Keys.X);
                }
                else if (input.IsKeyPressed(Keys.C))
                {
                    objetoSelecionado.AlterarPonto(Keys.C);
                }
                else if (input.IsKeyPressed(Keys.B))
                {
                    objetoSelecionado.AlterarPonto(Keys.B);
                }
                else if (input.IsKeyPressed(Keys.E))
                {
                    objetoSelecionado.AlterarPonto(Keys.E);
                }
                else if (input.IsKeyPressed(Keys.P))
                {
                    Console.WriteLine(objetoSelecionado);
                }
                else if (input.IsKeyPressed(Keys.Equal))
                {
                    objetoSelecionado.AlterarPonto(Keys.Equal);
                }
                else if (input.IsKeyPressed(Keys.Comma))
                {
                    objetoSelecionado.AlterarPonto(Keys.Comma);
                }
                else if (input.IsKeyPressed(Keys.Space))
                {
                    objetoSelecionado.Atualizar();
                    objetoSelecionado.AlterarPonto(Keys.Space);

                    //objetoSelecionado ??= mundo;
                    //objetoSelecionado = mundo.GrafocenaBuscaProximo(objetoSelecionado);
                }
                else if (input.IsKeyPressed(Keys.C))
                {
                    objetoSelecionado.shaderObjeto = new Shader("Shaders/shader.vert", "Shaders/shaderCiano.frag");
                }
            }
            #endregion

            #region  Mouse
            int janelaLargura = Size.X;
            int janelaAltura = Size.Y;
            Ponto4D mousePonto = new Ponto4D(MousePosition.X, MousePosition.Y);
            Ponto4D sruPonto = Utilitario.NDC_TelaSRU(janelaLargura, janelaAltura, mousePonto);

            //FIXME: o movimento do mouse em relação ao eixo X está certo. Mas tem um erro no eixo Y,,, aumentar o valor do Y aumenta o erro.
            if (input.IsKeyDown(Keys.LeftShift))
            {
                if (mouseMovtoPrimeiro)
                {
                    mouseMovtoUltimo = sruPonto;
                    mouseMovtoPrimeiro = false;
                }
                else
                {
                    var deltaX = sruPonto.X - mouseMovtoUltimo.X;
                    var deltaY = sruPonto.Y - mouseMovtoUltimo.Y;
                    mouseMovtoUltimo = sruPonto;

                    objetoSelecionado.AlterarPonto(new Ponto4D(objetoSelecionado.GetPonto(0).X + deltaX, objetoSelecionado.GetPonto(0).Y + deltaY, 0), 0);
                    objetoSelecionado.ObjetoAtualizar();
                }

                objetoSelecionado.AlterarPonto(sruPonto, 0);
                objetoSelecionado.ObjetoAtualizar();
            }
            #endregion
        }

        protected override void OnResize(ResizeEventArgs e)
        {
            base.OnResize(e);

            GL.Viewport(0, 0, Size.X, Size.Y);
        }

        protected override void OnUnload()
        {
            mundo.OnUnload();

            GL.BindBuffer(BufferTarget.ArrayBuffer, 0);
            GL.BindVertexArray(0);
            GL.UseProgram(0);

            GL.DeleteBuffer(_vertexBufferObject_sruEixos);
            GL.DeleteVertexArray(_vertexArrayObject_sruEixos);

            GL.DeleteProgram(_shaderVermelha.Handle);
            GL.DeleteProgram(_shaderVerde.Handle);
            GL.DeleteProgram(_shaderAzul.Handle);

            base.OnUnload();
        }

#if CG_Gizmo
        private void Sru3D()
        {
#if CG_OpenGL && !CG_DirectX
            GL.BindVertexArray(_vertexArrayObject_sruEixos);
            // EixoX
            _shaderVermelha.Use();
            GL.DrawArrays(PrimitiveType.Lines, 0, 2);
            // EixoY
            _shaderVerde.Use();
            GL.DrawArrays(PrimitiveType.Lines, 2, 2);
            // EixoZ
            _shaderAzul.Use();
            GL.DrawArrays(PrimitiveType.Lines, 4, 2);
#elif CG_DirectX && !CG_OpenGL
      Console.WriteLine(" .. Coloque aqui o seu código em DirectX");
#elif (CG_DirectX && CG_OpenGL) || (!CG_DirectX && !CG_OpenGL)
      Console.WriteLine(" .. ERRO de Render - escolha OpenGL ou DirectX !!");
#endif
        }
#endif
    }
}
