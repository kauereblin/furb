import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe04 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double n;

  public static void main (String[] args) {
    n = sc.nextDouble();

    if (n % 1 > 0) {
      System.out.println(n + " tem casas decimais");
    } else {
      System.out.println(n + " não tem casas decimais");
    }

    sc.close();
  }
}
