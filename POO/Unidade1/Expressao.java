public class Expressao {
  private String exp;
  private static final char ABRE  = '(';
  private static final char FECHA = ')';

  private static final char ADICAO    = '+';
  private static final char SUBTRACAO = '-';
  private static final char PRODUTO   = '*';
  private static final char DIVISAO   = '/';

  Expressao(String exp) {
    this.exp = exp;
  }

  public boolean estaCorretaSintaticamente() {
    // REGEX: ^([-+/*]\d+(\.\d+)?)*
    // ^        - beginning of the string
    // [-+/*]   - one of these operators
    // \d+      - one or more numbers
    // (\.\d+)? - an optional dot followed by one or more numbers
    // ()*      - the whole expression repeated zero or more times
    int qtdA = 0;
    int qtdF = 0;

    for (char simbolo : this.exp.toCharArray()) {
      switch (simbolo) {
        case ABRE : qtdA++; break;
        case FECHA: qtdF++; break;
        default   :         break;
      }

      if (qtdF > qtdA)
        return false;
    }

    if (qtdA == qtdF)
      return true;

    return false;
  }

  public int getQtdDivisores() {
    int qtdDivisores = 0;

    for (char simbolo : this.exp.toCharArray()) {
      switch (simbolo) {
        case DIVISAO: qtdDivisores++; break;
        default     :                 break;
      }
    }

    return qtdDivisores;
  }

  public int getPosicaoOperador() {
    for (int i = 0; i < this.exp.length(); i++) {
      switch (this.exp.charAt(i)) {
        case ADICAO   : return i;
        case SUBTRACAO: return i;
        case PRODUTO  : return i;
        case DIVISAO  : return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Expressao expre = new Expressao("*////*");
    System.out.println(expre.estaCorretaSintaticamente());
    System.out.println(expre.getQtdDivisores());
    System.out.println(expre.getPosicaoOperador());
  }
}
