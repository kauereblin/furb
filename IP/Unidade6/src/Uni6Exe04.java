import java.util.Scanner;

public class Uni6Exe04 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    int vector1[] = new int[10];
    int vector2[] = new int[10];
    int sumVector[] = new int[10];
    int number = 0;

    for (int i = 0; i < 10; i++) {
      number = sc.nextInt();
      vector1[i] = number;
    }

    for (int i = 0; i < 10; i++) {
      number = sc.nextInt();
      vector2[i] = number;
    }

    for (int i = 0; i < 10; i++) {
      sumVector[i] = vector1[i] + vector2[i];
      System.out.println(sumVector[i]);
    }

    sc.close();
  }
}
