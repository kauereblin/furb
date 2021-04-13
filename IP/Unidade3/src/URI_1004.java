import java.util.Scanner;

public class URI_1004 {
  final private static Scanner sc = new Scanner(System.in);
  private static int x, y, PROD;

  public static void main(String[] args) {
    x = sc.nextInt();
    y = sc.nextInt();
    PROD = x * y;

    System.out.println("PROD = " + PROD);

    sc.close();
  }
}
