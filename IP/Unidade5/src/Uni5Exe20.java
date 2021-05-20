import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe20 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static int secHalfLife = 50;
  private static int totalSeconds;
  private static double grams;

  public static void main (String[] args) {
    System.out.print("Digite a quantidade de kilos do material: ");
    grams = sc.nextDouble();
    grams *= 1000;

    System.out.println("Massa inicial: " + grams + " g");

    while (grams > .5) {
      grams /= 2;
      totalSeconds += secHalfLife;
    }

    System.out.println("Massa final: " + grams + " g");
    System.out.println("Tempo decorrido: " + totalSeconds + " segundos");

    sc.close();
  }
}
