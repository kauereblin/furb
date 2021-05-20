import java.util.Scanner;

public class Uni5Exe03 {
  final private static int numerator = 1;
  private static double sum;

  public static void main (String[] args) {
    for (double i = 1; i <= 100; i++) {
      sum += numerator / i;
    }

    System.out.println(sum);
  }
}
