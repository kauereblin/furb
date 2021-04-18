import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe07 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double grams, extraGrams, extraValue, totalValue;

  public static void main (String[] args) {
    grams = sc.nextDouble();

    if (grams > 50) {
      extraGrams = grams - 50;
      extraGrams = extraGrams / 20;
      extraValue = extraGrams * 0.45;
    }

    totalValue = 0.45 + extraValue;

    System.out.println(totalValue);

    sc.close();
  }
}
