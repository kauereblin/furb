import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from numpy.linalg import inv

from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score


if __name__ == "__main__":
  df = pd.read_csv("./assets/data_preg.csv", header=None)

  x = df[0].values
  y = df[1].values

  figure = plt.figure()

  plt.scatter(x, y, color='blue') # 1. gráfico dispersão

  p = np.polyfit(x, y, 1) # 2. reta de regressão
  yn = np.poly1d(p)
  eqm1 = np.sum(np.power(y - yn(x), 2)) / len(y)
  plt.plot(x, yn(x), '-', color='red', label='Reta de Regressão grau 1')

  p = np.polyfit(x, y, 2) # 2. reta de regressão
  yn = np.poly1d(p)
  eqm2 = np.sum(np.power(y - yn(x), 2)) / len(y)
  plt.plot(x, yn(x), '-', color='green', label='Reta de Regressão grau 2')

  p = np.polyfit(x, y, 3) # 2. reta de regressão
  yn = np.poly1d(p)
  eqm3 = np.sum(np.power(y - yn(x), 2)) / len(y)
  plt.plot(x, yn(x), '-', color='black', label='Reta de Regressão grau 3')

  p = np.polyfit(x, y, 8) # 2. reta de regressão
  yn = np.poly1d(p)
  eqm8 = np.sum(np.power(y - yn(x), 2)) / len(y)
  plt.plot(x, yn(x), '-', color='yellow', label='Reta de Regressão grau 8')
  
  plt.legend(loc='upper right')
  plt.show()

  # EQM= (soma(residuo)) / size(y,1)
  # g) Calcule o Erro Quadrático Médio (EQM) para cada linha de regressão. Qual é o mais preciso?
  print("Erro Quadrático Médio (EQM) para cada linha de regressão:")
  print("Linha Vermelha: ", eqm1)
  print("Linha Verde: ", eqm2)
  print("Linha Preta: ", eqm3)
  print("Linha Amarela: ", eqm8, "\n")

  #h) Para evitar o overfitting, divida os dados aleatoriamente em Dados de Treinamento e Dados de Teste. Use os primeiros 10% dos dados como conjunto de teste, e o resto como de treinamento.
  x_train = x[10:]
  y_train = y[10:]
  x_test = x[:10]
  y_test = y[:10]
  
  #i) Repita os passos de c - f, mas agora use apenas os dados de treinamento para ajustar a linha de regressão.
  p = np.polyfit(x_train, y_train, 1)
  yn = np.poly1d(p)
  eqm1 = np.sum(np.power(y_test - yn(x_test), 2)) / len(y_test)

  p = np.polyfit(x_train, y_train, 2)
  yn = np.poly1d(p)
  eqm2 = np.sum(np.power(y_test - yn(x_test), 2)) / len(y_test)

  p = np.polyfit(x_train, y_train, 3)
  yn = np.poly1d(p)
  eqm3 = np.sum(np.power(y_test - yn(x_test), 2)) / len(y_test)

  p = np.polyfit(x_train, y_train, 8)
  yn = np.poly1d(p)
  eqm8 = np.sum(np.power(y_test - yn(x_test), 2)) / len(y_test)

  #J) Repita o passo g, mas agora utilize somente os dados de Teste para calcular o erro.
  print("Erro Quadrático Médio (EQM) para cada linha de regressão considerando os Dados de Teste:")
  print("Erro Teste grau 1: ", eqm1)
  print("Erro Teste grau 2: ", eqm2)
  print("Erro Teste grau 3: ", eqm3)
  print("Erro Teste grau 8: ", eqm8, "\n")
  
  #k) Calcule o R2 para os dados de treino e teste (veja a função r2_score da biblioteca sklearn.metrics). O que se pode concluir com os resultados?
  # r2_train = r2_score(y_train, x_train)
  # r2_test = r2_score(y_test, x_test)
  # print("R2 para os dados de treino: ", r2_train)
  # print("R2 para os dados de teste: ", r2_test)
  # print("Conclusão: O modelo está com overfitting, pois o R2 para os dados de treino é maior que o R2 para os dados de teste.")

  # model = LinearRegression()
  # model.fit(x_train, y_train)

  # r2 = r2_score(y_test, model.predict(x_test))
  # print("R2 para os dados de teste: ", r2)