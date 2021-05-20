import java.util.Scanner;

public class Uni5Exe04 {
  private static double sum, numerator = 1, denominator = 0;

  public static void main (String[] args) {
    for (int i = 1; i <= 20; i++) {
      numerator += 2;
      denominator += 2 * i;

      sum += numerator / denominator;
    }

    System.out.println(sum);
  }
}
