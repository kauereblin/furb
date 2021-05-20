import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Uni6Exe07 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    ArrayList<Double> vector = new ArrayList<Double>();
    vector.add(0, 0.);

    int vectorLimit = 20;
    int actualSize = 1;

    double value = 0;

    boolean added = false;

    while (actualSize <= vectorLimit) {
      value = sc.nextDouble();

      for (int i = 0; i < actualSize && actualSize <= vectorLimit; i++) {
        if (vector.get(i) != value && !added) {
          added = false;
        } else if (vector.get(i) == value){
          added = true;
        }
      }

      if (!added) {
        vector.add(value);
        Collections.sort(vector);
      }

      added = false;

      actualSize = vector.size();
    }

    for (int i = 1; i <= 20; i++) {
      System.out.println(vector.get(i));
    }

    sc.close();
  }
}
