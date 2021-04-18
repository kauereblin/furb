import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe26 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String option;
  private static double pi = 3.1415925;
  private static double b, h, s, r, result;

  public static void main (String[] args) {
    System.out.println("Escolha uma opção (T, Q, R, C):");
    option = sc.next().toUpperCase();


    switch (option) {
      case "T":
        System.out.println("Digite a base e altura do triângulo:");
        b = sc.nextDouble();
        h = sc.nextDouble();
        result = b * h / 2;
        System.out.println("A área do triângulo é " + result);
        break;

      case "Q":
        System.out.println("Digite o lado do quadrado:");
        s = sc.nextDouble();
        result = s * s;
        System.out.println("A área do quadrado é " + result);
        break;

      case "R":
        System.out.println("Digite a base e altura do retângulo:");
        b = sc.nextDouble();
        h = sc.nextDouble();
        result = b * h;
        System.out.println("A área do retângulo é " + result);
        break;

      case "C":
        System.out.println("Digite o raio do círculo:");
        r = sc.nextDouble();
        result = pi * r * r;
        System.out.println("A área do círculo é " + result);
        break;

      default:
        System.out.println("Opção inválida");
    }

    sc.close();
  }
}
