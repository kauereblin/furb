import java.util.Scanner;

public class Uni6Exe08 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    double vector[] = new double[20];
    double distinctValues[] = new double[20];
    double vectorRepeat[] = new double[20];

    double value = 0;

    for (int i = 0; i < 20; i++) {
      value = sc.nextDouble();
      vector[i] = value;
    }

    for (int i = 0; i < 20; i++) {
      value = vector[i];

      for (int j = 0; j < 20; j++) {
        if (value == vector[j]) {
          vectorRepeat[i]++;
        }
      }
    }

    for (int i = 0; i < 20; i++) {
      System.out.println(vector[i] + " repete " + vectorRepeat[i]);
    }

    sc.close();
  }
}
