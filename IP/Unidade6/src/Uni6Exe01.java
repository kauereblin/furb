import java.util.Scanner;

public class Uni6Exe01 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    int vector[] = new int[10];
    int number = 0;

    for (int i = 0; i < 10; i++) {
      number = sc.nextInt();
      vector[i] = number;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(vector[i]);
    }

    sc.close();
  }
}
