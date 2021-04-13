import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe13 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int card1, card2, card3;
  private static boolean cardBool1, cardBool2, cardBool3;

  public static void main (String[] args) {
    card1 = sc.nextInt();
    card2 = sc.nextInt();
    card3 = sc.nextInt();

    cardBool1 = (card1 == 1 || card1 == 2 || card1 == 3);
    cardBool2 = (card2 == 1 || card2 == 2 || card2 == 3);
    cardBool3 = (card3 == 1 || card3 == 2 || card3 == 3);

    if (cardBool1 || cardBool2 || cardBool3) {
      if ((cardBool1 && cardBool2) || (cardBool1 && cardBool3) || (cardBool2 && cardBool3)) {
        if (cardBool1 && cardBool2 && cardBool3) {
          System.out.println("NOVE");
          return;
        }
        System.out.println("SEIS");
        return;
      }
      System.out.println("TRUCO");
    }

    sc.close();
  }
}
