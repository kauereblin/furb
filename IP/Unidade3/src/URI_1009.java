import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("####.00");
  private static String nameSeller;
  private static double salary, sellPerMonth;

  public static void main(String[] args) {
    nameSeller = sc.nextLine();
    salary = sc.nextDouble();
    sellPerMonth = sc.nextDouble();

    salary += sellPerMonth * 0.15;

    System.out.println("TOTAL = R$ " + df.format(salary));

    sc.close();
  }
}
