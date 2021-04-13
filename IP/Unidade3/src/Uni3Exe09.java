import java.util.Scanner;

public class Uni3Exe09 {
  final private static Scanner sc = new Scanner(System.in);
  final private static double pi = 3.14159265358979323846264;
  private static double radius, height, size;

  public static void main (String[] args) {
    radius = sc.nextDouble();
    height = sc.nextDouble();

    size = pi * radius * radius * height;

    System.out.println("Volume da lata: " + size);

    sc.close();
  }
}
