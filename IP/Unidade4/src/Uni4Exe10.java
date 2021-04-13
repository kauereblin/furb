import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe10 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int ageMarquinhos, ageZe, ageLulu;

  public static void main (String[] args) {
    ageMarquinhos = sc.nextInt();
    ageZe = sc.nextInt();
    ageLulu = sc.nextInt();

    if (ageMarquinhos < ageZe && ageMarquinhos < ageLulu) {
      System.out.println("Marquinhos é o caçula");
    } else if (ageZe < ageLulu) {
      System.out.println("Zézinho é o caçula");
    } else {
      System.out.println("Luluzinha é a caçula");
    }

    sc.close();
  }
}
