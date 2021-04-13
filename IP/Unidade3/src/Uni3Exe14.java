import java.util.Scanner;

public class Uni3Exe14 {
  final private static Scanner sc = new Scanner(System.in);
  private static double distance, time, avgVelocity, spentFuel;

  public static void main (String[] args) {
    distance = sc.nextDouble();
    time = sc.nextDouble();

    avgVelocity = distance / time;
    spentFuel = distance / 12;

    System.out.println("Velocidade Média: " + avgVelocity);
    System.out.println("Combustível Gasto: " + spentFuel);

    sc.close();
  }
}
