import java.util.Scanner;

public class Uni3Exe08 {
  final private static Scanner sc = new Scanner(System.in);
  private static double dolar, real;

  public static void main (String[] args) {
    dolar = sc.nextDouble();

    real = dolar * 5.56;

    System.out.println("Preco em reais: " + real);

    sc.close();
  }
}
