import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe34 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String name;
  private static int dailyNumber, accounts, option;
  private static double payment;

  public static void main (String[] args) {
    do {
      System.out.println("(1) encerrar a conta de um hospede");
      System.out.println("(2) verificar numero de contas encerradas");
      System.out.println("(3) sair");
      option = sc.nextInt();

      switch (option) {
        case 1:
          System.out.print("Digite o nome do hospede: ");
          name = sc.next();
          System.out.print("Digite a quantidade de diarias: ");
          dailyNumber = sc.nextInt();

          if (dailyNumber < 15) {
            payment = dailyNumber * 7.5;
          } else if (dailyNumber > 15) {
            payment = dailyNumber * 5;
          } else {
            payment = dailyNumber * 6.5;
          }

          System.out.println("Hospede: " + name);
          System.out.println("Valor a pagar: R$" + payment);

          accounts++;
          break;

        case 2: System.out.println("Contas fechadas: " + accounts); break;

        default:
          System.out.println("Opcao invalida!");
          break;
      }

    } while (option != 3);

    sc.close();
  }
}
