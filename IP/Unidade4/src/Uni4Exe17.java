import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe17 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double annualIncome, netIncome, tax;
  private static int numberDependents;

  public static void main (String[] args) {
    System.out.println("Digite a renda anual:");
    annualIncome = sc.nextDouble();
    System.out.println("Digite o número de dependentes:");
    numberDependents = sc.nextInt();

    netIncome = annualIncome - annualIncome * (numberDependents * 0.02);

    if (netIncome > 2000 && netIncome <= 5000) {
      tax = netIncome * .05;
    } else if (netIncome > 5000 && netIncome <= 10000) {
      tax = netIncome * .1;
    } else if (netIncome > 10000) {
      tax = netIncome * .15;
    }

    System.out.println("A renda líquida é " + netIncome);
    System.out.println("O imposto a ser aplicado é " + tax);
    sc.close();
  }
}
