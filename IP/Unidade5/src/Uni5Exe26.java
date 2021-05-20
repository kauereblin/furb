import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe26 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double maxTollValue, tollValue, distance;
  private static int aboveValues, qttParts, above150Parts;
  public static void main (String[] args) {
    System.out.print("Digite o valor maximo que Astolfo paga: ");
    maxTollValue = sc.nextDouble();

    System.out.print("Digite o valor do pedagio: ");
    tollValue = sc.nextDouble();

    while (tollValue >= 0) {
      System.out.print("Digite a distancia do pedagio: ");
      distance = sc.nextDouble();

      if (tollValue > maxTollValue) {
        aboveValues++;
      } else if (tollValue <= maxTollValue && distance > 150) {
        above150Parts++;
      }

      qttParts++;

      System.out.print("Digite o valor do outro pedagio: ");
      tollValue = sc.nextDouble();
    }

    System.out.println("Valores acima do que Astolvo deseja pagar: " + aboveValues);
    System.out.println("Quantidade de trechos: " + qttParts);
    System.out.println("Partes maiores de 150 KM que estao abaixo do limite de preco: " + above150Parts);

    sc.close();
  }
}
