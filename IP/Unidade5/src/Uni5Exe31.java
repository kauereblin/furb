import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe31 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int number, divider = 2;

  public static void main (String[] args) {
    System.out.print("Digite um numero: ");
    number = sc.nextInt();

    while (divider < number) {
      while (number % divider == 0) {
        System.out.println(divider);
        number /= divider;
      }

      ++divider;
    }

    if (number > 2) {
      System.out.println(divider);
    }

    sc.close();
  }
}
