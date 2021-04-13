import java.util.Locale;
import java.util.Scanner;

public class URI_1016 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int km, min;

  public static void main(String[] args) {
    km = sc.nextInt();

    min = km * 2;

    System.out.println(min + " minutos");

    sc.close();
  }
}
