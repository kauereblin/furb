import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe25 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String option;
  private static double n1, n2, result;

  public static void main (String[] args) {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Soma de dois números.");
    System.out.println("2 - Diferença entre dois números.");
    System.out.println("3 - Produto entre dois números.");
    System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
    option = sc.next();

    System.out.println("Digite os dois números:");
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();

    switch (option) {
      case "1":
        result = n1 + n2;
        System.out.println("A soma é " + result);
        break;
      case "2":
        result = n1 - n2;
        System.out.println("A diferença é " + result);
        break;
      case "3":
        result = n1 * n2;
        System.out.println("O produto é " + result);
        break;
      case "4":
        if (n2 == 0) {
          System.out.println("O DIVISOR NÃO PODE SER 0!!!");
          return;
        }
        result = n1 / n2;
        System.out.println("O produto é " + result);
        break;
      default:
        System.out.println("Opção inválida");
    }

    sc.close();
  }
}
