import java.util.Scanner;

public class Uni3Exe12 {
  final private static Scanner sc = new Scanner(System.in);
  private static String name;
  private static double hoursPerMonth, dependents, workSalary, familySalary, grossSalary, netSalary;

  public static void main (String[] args) {
    name = sc.nextLine();
    hoursPerMonth = sc.nextInt();
    dependents = sc.nextInt();

    workSalary = hoursPerMonth * 10;
    familySalary = dependents * 60;

    grossSalary = workSalary + familySalary;

    netSalary = grossSalary - (grossSalary * 0.085 + grossSalary * 0.05);

    System.out.println("Funcionário: " + name);
    System.out.println("Salário Líquido: " + netSalary);
    System.out.println("Salário Bruto: " + grossSalary);

    sc.close();
  }
}
