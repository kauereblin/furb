import java.util.Scanner;

public class Uni5Exe06 {
  final private static Scanner sc = new Scanner(System.in);
  private static double avg;

  public static void main (String[] args) {
    for (int i = 0; i < 20; i++) {
      avg += sc.nextDouble();
    }

    System.out.println(avg / 20);

    sc.close();
  }
}
