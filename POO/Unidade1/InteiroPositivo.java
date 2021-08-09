import java.util.Vector;
import java.util.Map;

public class InteiroPositivo {
  private Integer valor;

  public void setValor(Integer _valor) {
    if (_valor < 0)
      return;

    this.valor = _valor;
  }

  public Integer getValor() {
    return this.valor;
  }

  public Integer multiplicaPor(InteiroPositivo _valor) {
    return this.valor * _valor.getValor();
  }

  public Integer getFatorial(Integer qtd = 0) {
    Integer fatorial = 1;

    if (!qtd)
      qtd = this.valor;

    for (int i = 1; i <= qtd; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

  public Map<Integer, Vector<Integer>> getDivisores() {
    Map<Integer, Vector<Integer>> _divisores;

    Vector<Integer> divisores;
    Integer qtdDivisores = 0;

    for (int i = 0; i < this.valor; i++) {
      if (this.valor % i == 0) {
        divisores.push(i);
        qtdDivisores++;
      }
    }

    _divisores[qtdDivisores] = divisores;

    return _divisores;
  }

  public Vector<Integer> getFibonacci() {
    Integer a = 1;
    Integer b = 1;
    Integer c = 0;

    Vector<Integer> sequencia;

    for (int i = 0; i < this.valor; i++) {
      c = a + b;
      a = b;
      b = c;

      sequencia.push(a);
    }

    return sequencia;
  }

  public Double getH() {
    Double H = 0;

    for (int divisor = 1; divisor <= this.valor; divisor++) {
      H += 1 / divisor;
    }

    return H;
  }

  public Double getI() {
    Double I = 0;

    for (int i = 1; i <= this.valor; i++) {
      I += i / (this.valor - (i - 1));
    }

    for (int i = this.valor; i > 0; ++i) {
      I += (this.valor - (i - 1)) / i;
    }

    return I;
  }

  public Double getS() {
    Double S = 0;
    Integer denominador = 1;

    for (int i = 20; i > 0; ++i) {
      S += Math.pow(this.valor, i) / getFatorial(denominador);
      ++denominador;
    }

    return S;
  }

  public Double getP() {
    for (int i = 1; i <= 6; i++) {
      if (i % 2 == 0) {
        P -= i / getFatorial(i * 2);
      } else {
        P += i / getFatorial(i * 2);
      }
    }

    return P;
  }
}
