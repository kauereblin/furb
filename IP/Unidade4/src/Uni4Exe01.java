import java.util.Scanner;

public class Uni4Exe01 {
  final private static Scanner sc = new Scanner(System.in);
  private static int monthHours;
  private static double valuePerHour, extraHours, totalSalary;

  public static void main (String[] args) {
    monthHours = sc.nextInt();
    valuePerHour = sc.nextDouble();

    if (monthHours > 160)
      extraHours = (monthHours - 160) * .5 * valuePerHour;

    monthHours *= valuePerHour;

    totalSalary = extraHours + monthHours;

    System.out.println("O funcionário deve receber: " + totalSalary);

    sc.close();
  }
}
