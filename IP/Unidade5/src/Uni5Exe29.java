import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe29 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int value, b20, b10, b5, b2, b1;

  public static void main (String[] args) {
    System.out.print("Digite o valor: ");
    value = sc.nextInt();

    while (value != 0) {
      if (value / 20 > 0) {
        b20 = value / 20;
        value %= 20;
      } else if (value / 10 > 0) {
        b10 = value / 10;
        value %= 10;
      } else if (value / 5 > 0) {
        b5 = value / 5;
        value %= 5;
      } else if (value / 2 > 0) {
        b2 = value / 2;
        value %= 2;
      } else {
        b1 = value;
        value = 0;
      }
    }

    System.out.println("Notas de 20: " + b20);
    System.out.println("Notas de 10: " + b10);
    System.out.println("Notas de 5: " + b5);
    System.out.println("Notas de 2: " + b2);
    System.out.println("Notas de 1: " + b1);

    sc.close();
  }
}
