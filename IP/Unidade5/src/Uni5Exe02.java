import java.util.Scanner;

public class Uni5Exe02 {
  private static double pairSum, oddSum;

  public static void main (String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        pairSum += i;
      } else {
        oddSum += i;
      }
    }

    System.out.println("Pares: " + pairSum);
    System.out.println("Impares: " + oddSum);
  }
}
