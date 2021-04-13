import java.util.Locale;
import java.util.Scanner;

public class URI_1018 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int value, b100, b50, b20, b10, b5, b2, b1;

  public static void main(String[] args) {
    value = sc.nextInt();

    System.out.println(value);

    while (value > 0) {
      if (value >= 100) {
        value -= 100;
        b100++;
      } else if (value >= 50) {
        value -= 50;
        b50++;
      } else if (value >= 20) {
        value -= 20;
        b20++;
      } else if (value >= 10) {
        value -= 10;
        b10++;
      } else if (value >= 5) {
        value -= 5;
        b5++;
      } else if (value >= 2) {
        value -= 2;
        b2++;
      } else if (value == 1) {
        value -= 1;
        b1++;
      }
    }

    System.out.println(b100 + " nota(s) de R$ 100,00");
    System.out.println(b50 + " nota(s) de R$ 50,00");
    System.out.println(b20 + " nota(s) de R$ 20,00");
    System.out.println(b10 + " nota(s) de R$ 10,00");
    System.out.println(b5 + " nota(s) de R$ 5,00");
    System.out.println(b2 + " nota(s) de R$ 2,00");
    System.out.println(b1 + " nota(s) de R$ 1,00");

    sc.close();
  }
}
