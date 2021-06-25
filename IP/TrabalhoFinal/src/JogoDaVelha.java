import java.util.Scanner;

public class JogoDaVelha {
  private Mapa jogoMapa;
  private PC jogoPC;
  private Jogador jogoJogador;

  private JogoDaVelha() {
    Scanner teclado = new Scanner(System.in);
    this.jogoMapa = new Mapa();
    this.jogoPC = new PC(this.jogoMapa);
    this.jogoJogador = new Jogador(this.jogoMapa);

    char opcao = 0;

    do {
      jogar(teclado);
      System.out.println("-------------------------------");
      System.out.println("Deseja jogar novamente? (s / n)");
      opcao = teclado.next().charAt(0);
    } while (opcao != 'n');

    System.out.println("--- FIM ---");

    teclado.close();
  }

  private void jogar(Scanner teclado) {
    this.jogoMapa.limpar();

    boolean vez = (this.jogoMapa.sortear(0, 2) == 1 ? true : false);
    boolean empate = true;

    int jogada = 0;
    this.jogoMapa.desenhar(jogada);

    while (jogada < 9) {
      if (vez) {
        if(this.jogoJogador.jogar(teclado)) {
          empate = false;
          break;
        }

        vez = !vez;
      } else {
        if (this.jogoPC.jogar()) {
          empate = false;
          break;
        }

        vez = !vez;
      }

      jogada++;
      this.jogoMapa.desenhar(jogada);
    }

    if (empate) {
      System.out.println(" ... EMPATOU");
    } else {
      jogada++;
    }

    this.jogoMapa.desenhar(jogada);
  }

  public static void main (String[] args) {
    new JogoDaVelha();
  }
}
