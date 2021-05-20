import java.util.Scanner;

public class Uni5Exe08 {
  final private static Scanner sc = new Scanner(System.in);
  private static int limit, number, sumPositive, min = 0;
  private static double positives;

  public static void main (String[] args) {
    limit = sc.nextInt();

    for (int i = 0; i < limit; i++) {
      number = sc.nextInt();

      if (number < min) {
        min = number;
      } else if (number > 0) {
        sumPositive += number;
        positives++;
      }
    }

    System.out.println("Menor: " + min);
    System.out.println("Media Positivos: " + sumPositive / positives);

    sc.close();
  }
}
