import java.util.Scanner;

public class Uni4Exe03 {
  final private static Scanner sc = new Scanner(System.in);
  private static int a, b;

  public static void main (String[] args) {
    a = sc.nextInt();
    b = sc.nextInt();

    if (a > b) {
      System.out.println(a + " é o maior");
    } else {
      System.out.println(b + " é o maior");
    }

    sc.close();
  }
}
