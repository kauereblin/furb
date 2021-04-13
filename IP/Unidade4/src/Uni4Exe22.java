import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe22 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String option;

  public static void main (String[] args) {
    System.out.println("Digite uma opção de 1 a 3:");
    option = sc.next();

    switch (option) {
      case "1":
        System.out.println("Bacharel em Ciência da Computação");
        break;
      case "2":
        System.out.println("Licenciado em Computação");
        break;
      case "3":
        System.out.println("Bacharel em Sistemas de Informação");
        break;
      default:
        System.out.println("Opção inválida");
    }

    sc.close();
  }
}
