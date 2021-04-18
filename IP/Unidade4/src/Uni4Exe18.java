import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe18 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int dueDay, payDay, difDays;
  private static double installment, payment;

  public static void main (String[] args) {
    System.out.println("Digite o dia de vencimento:");
    dueDay = sc.nextInt();
    System.out.println("Digite o dia do pagamento:");
    payDay = sc.nextInt();
    System.out.println("Digite o valor da prestação:");
    installment = sc.nextDouble();

    difDays = payDay - dueDay;

    if (difDays < 0) {
      payment = installment * 0.9;
      System.out.println("Pagamento está em dia");
    } else if (difDays <= 5 ) {
      payment = installment;
    } else {
      payment = installment + installment * difDays * 0.02;
    }

    System.out.println("O valor a ser pago é " + payment);
    sc.close();
  }
}
