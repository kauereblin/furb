import java.util.Scanner;

public class Uni5Exe12 {
  final private static Scanner sc = new Scanner(System.in);
  private static int rows, number = 1;

  public static void main (String[] args) {
    rows = sc.nextInt();

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j < i; j++){
        System.out.print(number + "  ");
        ++number;
      }

      System.out.println();
    }

    sc.close();
  }
}
