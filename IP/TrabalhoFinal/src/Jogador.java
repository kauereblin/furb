import java.util.Scanner;

public class Jogador {
  private final char letra = 'X';
  private Mapa mapa;

  public Jogador(Mapa mapa) {
    this.mapa = mapa;
  }

  public boolean jogar(Scanner teclado) {
    int linha, coluna;

    do {
      System.out.print("Digite a linha (1 - 3): ");
      linha = teclado.nextInt();
      linha--;

      System.out.print("Digite a coluna (1 - 3): ");
      coluna = teclado.nextInt();
      coluna--;
    } while (!this.mapa.jogar(linha, coluna, this.letra));

    if (this.mapa.verificarGanhador(this.letra)) {
      System.out.println(" ... Jogador GANHOU!");

      return true;
    }

    return false;
  }
}
