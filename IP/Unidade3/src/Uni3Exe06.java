import java.util.Scanner;

public class Uni3Exe06 {
  final private static Scanner sc = new Scanner(System.in);
  private static double weight, totalPrice;

  public static void main (String[] args) {
    weight = sc.nextDouble();

    weight -= 0.75;
    totalPrice = weight * 25;

    System.out.println("Total a pagar: " + totalPrice);

    sc.close();
  }
}
