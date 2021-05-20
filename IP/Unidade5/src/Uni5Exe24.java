import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe24 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String addFish = "s";
  private static double dayLimit, weight, totalWeight;

  public static void main (String[] args) {
    System.out.print("Digite o limite, em quilogramas, do peso de toda a pesca: ");
    dayLimit = sc.nextDouble();

    while (addFish.equals("s")) {
      System.out.print("Digite o peso do peixe: ");
      weight = sc.nextDouble();

      totalWeight += weight;

      if (totalWeight > dayLimit) {
        System.out.println("Peso limite da pesca do dia excedido");
        break;
      }

      System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NAO)?");
      addFish = sc.next();
    }

    sc.close();
  }
}
