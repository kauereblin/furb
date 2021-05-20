import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe23 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String name, addEmployee;
  private static int qttItems;
  private static double totalSales, salary, rateComission = 0.3;

  public static void main (String[] args) {
    System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NAO)?");
    addEmployee = sc.next();

    while (addEmployee.equals("s")) {
      System.out.print("Digite o nome do funcionario: ");
      name = sc.next();

      System.out.print("Digite o preco unitariodo produto: ");
      totalSales = sc.nextDouble();

      System.out.print("Digite a quantidade de produtos vendidos: ");
      qttItems = sc.nextInt();

      totalSales *= qttItems;

      salary = totalSales * rateComission;

      System.out.println("Funcionario: " + name);
      System.out.println("Total de vendas: " + totalSales);
      System.out.println("Salario do funcionario: " + salary);
      System.out.println();
      System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NAO)?");
      addEmployee = sc.next();
    }

    sc.close();
  }
}
