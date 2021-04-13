import java.util.Scanner;
import java.util.Locale;

public class Uni3Exe02 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double price, discount;

  public static void main (String[] args) {
    price = sc.nextDouble();

    discount = price * 0.12;
    price -= discount;

    System.out.println("O valor do desconto é de R$ " + discount);
    System.out.println("O preço do par de sapatos com desconto é R$ " + price);

    sc.close();
  }
}
