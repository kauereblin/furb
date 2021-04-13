import java.util.Scanner;

public class Uni4Exe02 {
  final private static Scanner sc = new Scanner(System.in);
  private static int n;

  public static void main (String[] args) {
    n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println("É par");
    } else {
      System.out.println("É ímpar");
    }

    sc.close();
  }
}
