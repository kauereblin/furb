import java.util.Scanner;

public class Uni6Exe02 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    double vector[] = new double[12];
    double number = 0;
    double avg = 0;

    for (int i = 0; i < 12; i++) {
      number = sc.nextDouble();
      vector[i] = number;
      avg += number;
    }

    avg /= 12.;

    for (int i = 0; i < 12; i++) {
      if (vector[i] > avg) {
        System.out.println(vector[i]);
      }
    }

    sc.close();
  }
}
