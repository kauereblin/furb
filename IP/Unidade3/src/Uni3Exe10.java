import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe10 {
  final private static Scanner sc = new Scanner(System.in);
  private static double cathetus1, cathetus2, hypotenuse;

  public static void main (String[] args) {
    cathetus1 = sc.nextDouble();
    cathetus2 = sc.nextDouble();

    hypotenuse = Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));

    System.out.println("A hipotenusa vale: " + hypotenuse);

    sc.close();
  }
}
