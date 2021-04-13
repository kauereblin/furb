import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe12 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double lado1, lado2, lado3;

  public static void main (String[] args) {
    lado1 = sc.nextDouble();
    lado2 = sc.nextDouble();
    lado3 = sc.nextDouble();

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
      if (lado1 == lado2 && lado1 == lado3) {
        System.out.println("É um triângulo equilátero");
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("É um triângulo isósceles");
      } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
        System.out.println("É um triângulo escaleno");
      }
    } else {
      System.out.println("Não é um triângulo");
    }

    sc.close();
  }
}
