import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe19 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static double maxDiscout = 1.2, minDiscout = 1.15;
  private static double buyPrice, payment, totalEarned;

  public static void main (String[] args) {
    System.out.print("Valor da compra: ");
    buyPrice = sc.nextDouble();

    while (buyPrice != 0) {
      if (buyPrice > 500.) {
        payment = buyPrice * maxDiscout;
      } else {
        payment = buyPrice * minDiscout;
      }

      System.out.println("Total a pagar: " + payment);

      totalEarned += payment;

      System.out.print("Valor da compra: ");
      buyPrice = sc.nextDouble();
    }

    System.out.println("Total recebido pela loja: " + totalEarned);

    sc.close();
  }
}
