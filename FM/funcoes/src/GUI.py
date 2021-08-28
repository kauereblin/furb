import PySimpleGUI as sg
import matplotlib.pyplot as plt
import numpy as np
from ParableEquation import ParableEquation

class GUI():
  def __init__(self):
    self.window, self.event, self.values = None, None, None
    self.landing = self.landing_layout()
    self.input = self.input_layout()
    self.input.hide()


  def landing_layout(self):
    sg.theme("DefaultNoMoreNagging")

    layout = [[sg.Text("""\nUm cientista está desenvolvendo um balão meteorológico.\n
Contudo, o monitoramento do dispositivo é precário, tendo apenas um\n
sinalizador de pontos por onde o balão passou pela atmosfera.\n
Ele tem o problema de perder muito material de análise, quando lança\n
um balão e não consegue encontrá-lo novamente. Por isso ele pede sua\n
ajuda para programar uma função que calcule a tragetória para onde o\n
balão pode ter ido a partir de três pontos importantes.""", size=(75, 0))],
              [sg.Button("Continuar")]]

    return sg.Window("Funcoes", size=(500, 300), layout=layout, element_justification="center", finalize=True)


  def input_layout(self):
    sg.theme("DefaultNoMoreNagging")

    layout = [[sg.Text("X1: "), sg.Input(size=(3, 0), key=("x1")), sg.Text("Y1: "), sg.Input(size=(3, 0), key=("y1"))],
              [sg.Text("X2: "), sg.Input(size=(3, 0), key=("x2")), sg.Text("Y2: "), sg.Input(size=(3, 0), key=("y2"))],
              [sg.Text("X3: "), sg.Input(size=(3, 0), key=("x3")), sg.Text("Y3: "), sg.Input(size=(3, 0), key=("y3"))],
              [sg.Button("Voltar"), sg.Button("Calcular")],
              [sg.Output()]]

    return sg.Window("Funcoes", size=(400, 200), layout=layout, element_justification="center", finalize=True)


  def render_window(self):
    while True:
      self.window, self.event, self.values = sg.read_all_windows()

      if self.event == sg.WINDOW_CLOSED:
        return

      if self.event == "Continuar":
        self.landing.hide()
        self.input.un_hide()

      if self.event == "Voltar":
        self.input.hide()
        self.landing.un_hide()

      if self.event == "Calcular":
        self.plot_graphic()


  def plot_graphic(self):
    parable = ParableEquation(float(self.values['x1']), float(self.values['y1']), float(self.values['x2']), float(self.values['y2']), float(self.values['x3']), float(self.values['y3']))
    parable.build_function()
    parable.define_equation()

    a, b, c = parable.a, parable.b, parable.c

    maximum, minimum = b, c

    if (b < c):
      maximum, minimum = c, b

    if a != 0:
      start, end = 0, abs(maximum / a) + 0.2

      x = np.arange(0, end, 0.01)
      y = a * (x ** 2) + b * x + c

      fig, axes = plt.subplots()
      plt.title("Trajetória do Balão")
      plt.ylabel("Altura")
      plt.xlabel("Distância")

      axes.plot(x, y)
      plt.show()
    else:
      print("Valores inválidos")
