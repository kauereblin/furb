import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe05 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static boolean response;

  public static void main (String[] args) {
    System.out.println("a cor é azul?");
    response = sc.nextBoolean();

    if (response) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    sc.close();
  }
}
