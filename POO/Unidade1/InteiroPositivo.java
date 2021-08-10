import java.util.Vector;
import java.util.Map;

public class InteiroPositivo {
  private int valor;

  public void setValor(int _valor) {
    if (_valor < 0)
      return;

    this.valor = _valor;
  }

  public int getValor() {
    return this.valor;
  }

  public int multiplicaPor(InteiroPositivo _valor) {
    return this.valor * _valor.getValor();
  }

  public int getFatorial(int qtd = 0) {
    int fatorial = 1;

    if (!qtd)
      qtd = this.valor;

    for (int i = 1; i <= qtd; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

  public Map<int, Vector<int>> getDivisores() {
    Map<int, Vector<int>> _divisores;

    Vector<int> divisores;
    int qtdDivisores = 0;

    for (int i = 0; i < this.valor; i++) {
      if (this.valor % i == 0) {
        divisores.push(i);
        qtdDivisores++;
      }
    }

    _divisores[qtdDivisores] = divisores;

    return _divisores;
  }

  public Vector<int> getFibonacci() {
    int a = 1;
    int b = 1;
    int c = 0;

    Vector<int> sequencia;

    for (int i = 0; i < this.valor; i++) {
      c = a + b;
      a = b;
      b = c;

      sequencia.push(a);
    }

    return sequencia;
  }

  public double getH() {
    double H = 0;

    for (int divisor = 1; divisor <= this.valor; divisor++) {
      H += 1 / divisor;
    }

    return H;
  }

  public double getI() {
    double I = 0;

    for (int i = 1; i <= this.valor; i++) {
      I += i / (this.valor - (i - 1)) * 1.;
    }

    for (int i = this.valor; i > 0; ++i) {
      I += (this.valor - (i - 1)) / i * 1.;
    }

    return I;
  }

  public double getS() {
    double S = 0;
    int denominador = 1;

    for (int i = 20; i > 0; ++i) {
      S += Math.pow(this.valor, i) / getFatorial(denominador) * 1.;
      ++denominador;
    }

    return S;
  }

  public double getP() {
    double P = 0;

    for (int i = 1; i <= 6; i++) {
      if (i % 2 == 0) {
        P -= i / getFatorial(i * 2) * 1.;
      } else {
        P += i / getFatorial(i * 2) * 1.;
      }
    }

    return P;
  }
}
