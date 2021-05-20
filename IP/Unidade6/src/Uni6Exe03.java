import java.util.Scanner;

public class Uni6Exe03 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    double vector[] = new double[12];
    double number = 0;

    for (int i = 0; i < 12; i++) {
      number = sc.nextDouble();
      vector[i] = number;

      if (i % 2 == 0) {
        vector[i] *= 1.2;
      } else {
        vector[i] *= 1.5;
      }

      System.out.println(vector[i]);
    }

    sc.close();
  }
}
