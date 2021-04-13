import java.util.Scanner;

public class Uni3Exe04 {
  final private static Scanner sc = new Scanner(System.in);
  private static double g1, g2, g3, avarage;

  public static void main (String[] args) {
    g1 = sc.nextDouble();
    g2 = sc.nextDouble();
    g3 = sc.nextDouble();

    avarage = (g1 * 5 + g2 * 3 + g3 * 2 ) / 10;

    System.out.println("A media do aluno e: " + avarage);

    sc.close();
  }
}
