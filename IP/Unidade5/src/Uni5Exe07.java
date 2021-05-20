import java.util.Scanner;

public class Uni5Exe07 {
  final private static Scanner sc = new Scanner(System.in);
  private static int limit;
  private static double number, min = 100000000, max = -10000000;

  public static void main (String[] args) {
    limit = sc.nextInt();

    for (int i = 0; i < limit; i++) {
      number = sc.nextDouble();

      if (number < min) {
        min = number;
      }

      if (number > max) {
        max = number;
      }
    }

    System.out.println("Menor: " + min);
    System.out.println("Maior: " + max);

    sc.close();
  }
}
