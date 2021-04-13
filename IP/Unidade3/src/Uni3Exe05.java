import java.util.Scanner;

public class Uni3Exe05 {
  final private static Scanner sc = new Scanner(System.in);
  private static double chickens, totalPrice;

  public static void main (String[] args) {
    chickens = sc.nextInt();

    totalPrice = chickens * 4.5 + chickens * 7;

    System.out.println("Gasto total: " + totalPrice);

    sc.close();
  }
}
