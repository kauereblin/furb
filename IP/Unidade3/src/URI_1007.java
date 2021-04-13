import java.util.Scanner;

public class URI_1007 {
  final private static Scanner sc = new Scanner(System.in);
  private static int A, B, C, D, result;

  public static void main(String[] args) {
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    result = A * B - C * D;

    System.out.println("DIFERENCA = " + result);

    sc.close();
  }
}
