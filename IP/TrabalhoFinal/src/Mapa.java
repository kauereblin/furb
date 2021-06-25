public class Mapa {
  char[][] mapa = new char[3][3];

  public int sortear(int inicio, int fim) {
    return (int) ((Math.random() * fim) - inicio);
  }

  public void limpar() {
    for (int i = 0; i < this.mapa.length; i++) {
      for (int j = 0; j < this.mapa[i].length; j++) {
        this.mapa[i][j] = ' ';
      }
    }
  }

  public void desenhar(int jogada) {
    System.out.println("- .. jogada: " + jogada);
    for (int i = 0; i < this.mapa.length; i++) {
      System.out.println("-------------");
      System.out.print("| ");
      for (int j = 0; j < this.mapa[i].length; j++) {
        System.out.print(this.mapa[i][j] + " | ");
      }
      System.out.println("");
    }
    System.out.println("--------------");
  }

  public boolean jogar(int l, int c, char jogador) {
    if ((l < 0 || l > 2 || c < 0 || c > 2 || this.mapa[l][c] != ' ') && jogador == 'X') {
      System.out.println("Opcao errada!");

      return false;
    }

    if (this.mapa[l][c] == ' ') {
      this.mapa[l][c] = jogador;

      return true;
    }

    return false;
  }

  public boolean verificarGanhador(char jogador) {
    for (int i = 0; i < this.mapa.length; i++) {
      if (this.mapa[i][0] == jogador && this.mapa[i][1] == jogador && this.mapa[i][2] == jogador) {
        return true;
      }

      if (this.mapa[0][i] == jogador && this.mapa[1][i] == jogador && this.mapa[2][i] == jogador) {
        return true;
      }
    }

    if (this.mapa[0][0] == jogador && this.mapa[1][1] == jogador && this.mapa[2][2] == jogador ||
        this.mapa[0][2] == jogador && this.mapa[1][1] == jogador && this.mapa[2][0] == jogador) {
          return true;
    }

    return false;
  }
}
