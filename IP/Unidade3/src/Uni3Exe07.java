import java.util.Scanner;

public class Uni3Exe07 {
  final private static Scanner sc = new Scanner(System.in);
  private static int can350, bottle600, bottle2, liters;

  public static void main (String[] args) {
    can350 = sc.nextInt();
    bottle600 = sc.nextInt();
    bottle2 = sc.nextInt();

    liters = (can350 * 350 + bottle600 * 600 + bottle2 * 2000) / 1000;

    System.out.println("Total em litros: " + liters);

    sc.close();
  }
}
