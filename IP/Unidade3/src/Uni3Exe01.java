import java.util.Scanner;

public class Uni3Exe01 {
  final private static Scanner sc = new Scanner(System.in);
  private static double w, h, a;

  public static void main (String[] args) {
    w = sc.nextDouble();
    h = sc.nextDouble();

    a = w * h;

    System.out.println("Area do terreno: " + a);

    sc.close();
  }
}
