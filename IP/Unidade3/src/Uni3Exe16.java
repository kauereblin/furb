import java.util.Scanner;

public class Uni3Exe16 {
  final private static Scanner sc = new Scanner(System.in);
  private static int bill, payment, difference, hundred, dozen, unit;

  public static void main (String[] args) {
    bill = sc.nextInt();
    payment = sc.nextInt();

    difference = payment - bill;

    if (difference < 0) {
      System.out.println("Pagamento insuficiente!");
    } else {
      hundred = difference / 100;
      difference -= hundred * 100;

      dozen = difference / 10;

      unit = difference % 10;

      System.out.println("Troco em notas de cem: " + hundred);
      System.out.println("Troco em notas de dez: " + dozen);
      System.out.println("Troco em notas de um: " + unit);
    }

    sc.close();
  }
}
