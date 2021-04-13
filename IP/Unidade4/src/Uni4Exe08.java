import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe08 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String str;

  public static void main (String[] args) {
    str = sc.next().toLowerCase();

    if (str.equals("i") || str.equals("e") || str.equals("u") || str.equals("a") || str.equals("o")) {
      System.out.println("É vogal");
    } else {
      System.out.println("Não é vogal");
    }

    sc.close();
  }
}
