public class Uni5Exe22 {
  private static int year = 1995;
  private static double increase = 0.015, salary = 2000;

  public static void main (String[] args) {
    while (year < 2021) {
      salary *= (1 + increase);
      increase *= 2;
      year++;
    }

    System.out.println("Salario final: " + salary);
  }
}
