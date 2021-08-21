/*
Autor: Kaue Reblin
Curso: Bacharelado em Ciência da Computação
Turma: Noturno - B
*/

import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

public class InteiroPositivo {
  private int valor;

  public static void main(String[] args) {
    InteiroPositivo inteiro = new InteiroPositivo();

    inteiro.setValor(7);
    System.out.println("Valor = " + inteiro.getValor());
    System.out.println("Fatorial = " + inteiro.fatorial());
    System.out.println("Valor H = " + inteiro.valorH());
    System.out.println("Valor I = " + inteiro.valorI());
    System.out.println("Valor P = " + inteiro.valorP());
  }

  public void setValor(int _valor) {
    if (_valor < 0)
      return;

    this.valor = _valor;
  }

  public int getValor() {
    return this.valor;
  }

  public int multiplica(InteiroPositivo _valor) {
    return this.valor * _valor.getValor();
  }

  public long fatorial() {
    long fatorial = 1;

    for (long i = 1; i <= this.valor; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

  public double fatorial(int qtd) {
    double fatorial = 1;

    for (int i = 1; i <= qtd; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

  public Map<Integer, Vector<Integer>> getDivisores() {
    Map<Integer, Vector<Integer>> _divisores = new HashMap<>();

    Vector<Integer> divisores = new Vector<>();
    int qtdDivisores = 0;

    for (int i = 0; i < this.valor; i++) {
      if (this.valor % i == 0) {
        divisores.add(i);
        qtdDivisores++;
      }
    }

    _divisores.put(qtdDivisores, divisores);

    return _divisores;
  }

  public Vector<Integer> getFibonacci() {
    int a = 1;
    int b = 1;
    int c = 0;

    Vector<Integer> sequencia = new Vector<>();

    for (int i = 0; i < this.valor; i++) {
      c = a + b;
      a = b;
      b = c;

      sequencia.add(a);
    }

    return sequencia;
  }

  public double valorH() {
    double H = 0;

    for (int divisor = 1; divisor <= this.valor; divisor++) {
      H += 1. / divisor;
    }

    return H;
  }

  public double valorI() {
    double I = 0;

    for (double i = 0; i < this.valor; i++) {
      I += (i + 1) / (this.valor - i);
    }

    return I;
  }

  public double valorS() {
    double S = 0;
    int denominador = 1;

    for (int i = 20; i > 0; --i) {
      S += Math.pow(this.valor, i) / this.fatorial(denominador);
      ++denominador;
    }

    return S;
  }

  public double valorP() {
    double P = 0;

    for (int i = 1; i <= this.valor; i++) {
      if (i % 2 == 0) {
        P -= i / this.fatorial(i * 2);
      } else {
        P += i / this.fatorial(i * 2);
      }
    }

    return P;
  }
}
