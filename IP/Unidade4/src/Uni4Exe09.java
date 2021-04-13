import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe09 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int a, b;

  public static void main (String[] args) {
    a = sc.nextInt();
    b = sc.nextInt();

    if (a % b == 0 || b % a == 0) {
      System.out.println("São múltiplos");
    } else {
      System.out.println("Não são múltiplos");
    }

    sc.close();
  }
}
