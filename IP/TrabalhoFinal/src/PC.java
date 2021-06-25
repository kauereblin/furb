public class PC {
  private Mapa mapa;
  private final char letra = 'O';

  public PC(Mapa mapa) {
    this.mapa = mapa;
  }

  public boolean jogar() {
    int linha, coluna;
    do {
      linha = this.mapa.sortear(0, 3);
      coluna = this.mapa.sortear(0, 3);
    } while (!this.mapa.jogar(linha, coluna, this.letra));

    if (this.mapa.verificarGanhador(this.letra)) {
      System.out.println(" ... PC GANHOU!");

      return true;
    }

    return false;
  }
}
