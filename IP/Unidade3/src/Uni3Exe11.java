import java.util.Scanner;

public class Uni3Exe11 {
  final private static Scanner sc = new Scanner(System.in);
  private static double fahrenheit, celsius;

  public static void main (String[] args) {
    fahrenheit = sc.nextDouble();

    celsius = (fahrenheit - 32) * 5.0 / 9.0;

    System.out.println(fahrenheit + "°F = " + celsius + "°C");

    sc.close();
  }
}
