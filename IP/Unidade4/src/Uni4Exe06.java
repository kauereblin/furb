import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe06 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String str;

  public static void main (String[] args) {
    str = sc.next().toUpperCase();

    if (str.equals("M")) {
      System.out.println("Masculino");
    } else if (str.equals("F")) {
      System.out.println("Feminino");
    } else if (str.equals("I")) {
      System.out.println("Não Informado");
    } else {
      System.out.println("Entrada Incorreta");
    }

    sc.close();
  }
}
