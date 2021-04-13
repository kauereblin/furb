import java.util.Scanner;

public class Uni3Exe03 {
  final private static Scanner sc = new Scanner(System.in);
  private static double gasPrice, payment, result;

  public static void main (String[] args) {
    System.out.println("Digite o preço da gasolina:");
    gasPrice = sc.nextDouble();
    System.out.println("Digite quanto ira pagar");
    payment = sc.nextDouble();

    result = payment / gasPrice;

    System.out.println("Você consegue abastecer " + result + " litros com R$ " + payment);

    sc.close();
  }
}
