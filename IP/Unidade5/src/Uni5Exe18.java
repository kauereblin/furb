import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe18 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int channel, channel4, channel5, channel9, channel12, qttPeople, qttTotalPeople;

  public static void main (String[] args) {
    System.out.print("Digite o canal assistido: ");
    channel = sc.nextInt();

    while (channel != 0) {
      System.out.print("Digite quantas pessoas assistem: ");
      qttPeople = sc.nextInt();

      if (channel == 4) {
        channel4 += qttPeople;
      } else if (channel == 5) {
        channel5 += qttPeople;
      } else if (channel == 9) {
        channel9 += qttPeople;
      } else if (channel == 12) {
        channel12 += qttPeople;
      }

      qttTotalPeople += qttPeople;

      System.out.print("Digite o canal assistido: ");
      channel = sc.nextInt();
    }

    System.out.println("Audiencia do canal 4: " + (((double) channel4 / qttTotalPeople) * 100));
    System.out.println("Audiencia do canal 5: " + (((double) channel5 / qttTotalPeople) * 100));
    System.out.println("Audiencia do canal 9: " + (((double) channel9 / qttTotalPeople) * 100));
    System.out.println("Audiencia do canal 12: " + (((double) channel12 / qttTotalPeople) * 100));

    sc.close();
  }
}
