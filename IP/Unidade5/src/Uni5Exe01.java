import java.util.Scanner;

public class Uni5Exe01 {
  final private static Scanner sc = new Scanner(System.in);
  private static int number;

  public static void main (String[] args) {
    for (int i = 0; i < 20; i++) {
      number = sc.nextInt();

      if (number % 2 == 0) {
        System.out.println("par");
      } else {
        System.out.println("impar");
      }
    }

    sc.close();
  }
}
