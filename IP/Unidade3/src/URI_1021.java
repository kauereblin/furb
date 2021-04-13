import java.util.Locale;
import java.util.Scanner;

public class URI_1021 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double value;
  private static int bills, coins, b100, b50, b20, b10, b5, b2, c1, c05, c02, c01, c005, c001;

  public static void main(String[] args) {
    value = sc.nextDouble();
    bills = (int) value;
    coins = (int) ((value - bills) * 100);

    b100 = bills / 100;
    bills -= b100 * 100;

    b50 = bills / 50;
    bills -= b50 * 50;

    b20 = bills / 20;
    bills -= b20 * 20;

    b10 = bills / 10;
    bills -= b10 * 10;

    b5 = bills / 5;
    bills -= b5 * 5;

    b2 = bills / 2;
    bills -= b2 * 2;

    c1 = bills;
    bills -= c1 * 1;

    c05 = coins / 50;
    coins -= c05 * 50;

    c02 = coins / 25;
    coins -= c02 * 25;

    c01 = coins / 10;
    coins -= c01 * 10;

    c005 = coins / 5;
    coins -= c005 * 5;

    c001 = coins;

    System.out.println("NOTAS:");
    System.out.println(b100 + " nota(s) de R$ 100.00");
    System.out.println(b50 + " nota(s) de R$ 50.00");
    System.out.println(b20 + " nota(s) de R$ 20.00");
    System.out.println(b10 + " nota(s) de R$ 10.00");
    System.out.println(b5 + " nota(s) de R$ 5.00");
    System.out.println(b2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(c1 + " moeda(s) de R$ 1.00");
    System.out.println(c05 + " moeda(s) de R$ 0.50");
    System.out.println(c02 + " moeda(s) de R$ 0.25");
    System.out.println(c01 + " moeda(s) de R$ 0.10");
    System.out.println(c005 + " moeda(s) de R$ 0.05");
    System.out.println(c001 + " moeda(s) de R$ 0.01");

    sc.close();
  }
}
