import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe25 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static String D = "D", E = "E";
  private static String winnerCode, winner;
  private static int difPoints, pointsL = 0, pointsR = 0;

  public static void main (String[] args) {
    while (true) {
      System.out.print("Digite o codigo do ganhador da jogada: ");
      winnerCode = sc.next();

      if (winnerCode.equals(D)) {
        pointsR++;
      } else if (winnerCode.equals(E)) {
        pointsL++;
      }

      if (pointsL >= 2) {
        difPoints = pointsL - pointsR;

        if (difPoints >= 2) {
          winner = E;
          break;
        }
      }

      if (pointsR >= 2) {
        difPoints = pointsR - pointsL;

        if (difPoints >= 2) {
          winner = D;
          break;
        }
      }
    }

    System.out.println("Vencedor: " + winner);

    sc.close();
  }
}
