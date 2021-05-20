import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe06 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    ArrayList<Double> vector = new ArrayList<Double>();
    int vectorSize = 0;

    vectorSize = sc.nextInt();

    double value = 0;

    for (int i = 0; i < vectorSize; i++) {
      value = sc.nextDouble();

      vector.add(value);
    }

    double valueRequest = 0;
    valueRequest = sc.nextDouble();

    for (int i = 0; i < vectorSize; i++) {
      if (vector.get(i) == valueRequest) {
        System.out.print(true);
        break;
      }
    }

    sc.close();
  }
}
