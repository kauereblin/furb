import java.util.Scanner;

public class Uni3Exe13 {
  final private static Scanner sc = new Scanner(System.in);
  private static double width, height, area, totalPrice;

  public static void main (String[] args) {
    width = sc.nextDouble();
    height = sc.nextDouble();

    area = width * height;

    totalPrice = area * 12.5 * 9;

    System.out.println("Valor a pagar: " + totalPrice);

    sc.close();
  }
}
