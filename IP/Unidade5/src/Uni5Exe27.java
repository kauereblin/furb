import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe27 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String sProductivePeriod;
  private static int aprilDay, dayProductive, productivePeriod, qttMornigShift, qttAfternoonShift, newEmployee = 1;
  private static double salary, salaryMorning, salaryAfternoon, moreProductive;

  public static void main (String[] args) {

    while (newEmployee == 1) {
      System.out.print("Digite o dia do mes: ");
      aprilDay = sc.nextInt();

      if (aprilDay < 1 || aprilDay > 30) {
        System.out.println("Dia invalido");
        continue;
      }

      System.out.print("Digite a quantidade de pecas do periodo da manha: ");
      qttMornigShift = sc.nextInt();
      System.out.print("Digite a quantidade de pecas do periodo da tarde: ");
      qttAfternoonShift = sc.nextInt();

      if (aprilDay <= 15) {
        if ((qttMornigShift + qttAfternoonShift) > 100 && qttMornigShift > 30 && qttAfternoonShift > 30)
          salary = (qttMornigShift + qttAfternoonShift) * .8;
        else
          salary = (qttMornigShift + qttAfternoonShift) * .5;
      } else if (aprilDay >= 16) {
        salary = qttMornigShift * .4;
        salary += qttAfternoonShift * .3;
      }

      if (salary > moreProductive) {
        moreProductive = salary;
        dayProductive = aprilDay;

        if (salaryMorning > salaryAfternoon) {
          productivePeriod = qttMornigShift;
          sProductivePeriod = "Manha";
        }
        else {
          productivePeriod = qttAfternoonShift;
          sProductivePeriod = "Tarde";
        }
      }

      System.out.println("Salario: R$" + salary);

      System.out.println("Novo funcionario (1.sim 2.nao)?");
      newEmployee = sc.nextInt();
    }

    System.out.println("Dia de maior producao: " + dayProductive);
    System.out.println("Periodo de maior producao: " + sProductivePeriod);
    System.out.println("Quantidade produzida no periodo de maior producao: " + productivePeriod);

    sc.close();
  }
}
