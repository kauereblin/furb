import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("####.00");
  private static int employeeNumber, hoursWorked;
  private static double cashPerHour, salary;

  public static void main(String[] args) {
    employeeNumber = sc.nextInt();
    hoursWorked = sc.nextInt();
    cashPerHour = sc.nextDouble();
    // cashPerHour = Double.parseDouble(sc.nextLine());

    salary = hoursWorked * cashPerHour;

    System.out.println("NUMBER = " + employeeNumber);
    System.out.println("SALARY = U$ " + df.format(salary));

    sc.close();
  }
}
