import java.util.Scanner;

public class Uni5Exe13 {
  final private static Scanner sc = new Scanner(System.in);
  private static int replenishments, mileage, totalMileage;
  private static double qtGas, totalGas;

  public static void main (String[] args) {
    replenishments = sc.nextInt();

    for (int i = 0; i < replenishments; ++i) {
      qtGas = sc.nextDouble();
      mileage = sc.nextDouble();

      System.out.println(mileage / qtGas);

      totalMileage += mileage;
      totalGas += qtGas;
    }

    System.out.println(totalMileage / totalGas);

    sc.close();
  }
}
