import java.util.Scanner;

public class Uni4Exe01 {
  final private static Scanner sc = new Scanner(System.in);
  private static int monthHours;
  private static double weekHours, valuePerHour, extraHours, totalSalary;

  public static void main (String[] args) {
    monthHours = sc.nextInt();
    valuePerHour = sc.nextDouble();

    weekHours = monthHours / 4;

    if (weekHours > 40) {
      extraHours = (weekHours - 40) * 4 * 1.5 * valuePerHour;
    }

    weekHours = 160 * valuePerHour;

    totalSalary = extraHours + weekHours;

    System.out.println("O funcionário deve receber: " + totalSalary);

    sc.close();
  }
}
