import java.util.Scanner;

public class Uni5Exe05 {
  final private static Scanner sc = new Scanner(System.in);
  private static int limit, result = 8;

  public static void main (String[] args) {
    limit = sc.nextInt();

    for (int i = 1; i <= limit; ++i) {
      System.out.println(result);

      if (i % 2 == 0) {
        result = (result - 2) * 2;
      } else {
        result += 2;
      }
    }

    sc.close();
  }
}
