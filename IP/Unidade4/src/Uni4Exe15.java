import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe15 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int monthsEmployed;
  private static double salary;

  public static void main (String[] args) {
    System.out.println("Digite o salário do funcionário:");
    salary = sc.nextDouble();
    System.out.println("Digite quantos meses já trabalha na empresa:");
    monthsEmployed = sc.nextInt();

    if (monthsEmployed <= 12) {
      salary *= 1.05;
    } else if (monthsEmployed >= 13 && monthsEmployed <= 48) {
      salary *= 1.07;
    } else {
      System.out.println("Você é o CEO da empresa!");
      return;
    }
    System.out.println("O reajuste é de " + salary);

    sc.close();
  }
}
