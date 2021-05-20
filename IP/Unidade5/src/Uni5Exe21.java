public class Uni5Exe21 {
  final private static double growthRateChico = 0.02, growthRateZe = .03;
  private static double finalHeightChico = 1.5, finalHeightZe = 1.1;
  private static int qttYears;

  public static void main (String[] args) {
    while (finalHeightChico > finalHeightZe) {
      finalHeightChico += growthRateChico;
      finalHeightZe += growthRateZe;

      qttYears++;
    }

    System.out.println("Anos necessarios para Ze ser maior que Chico: " + qttYears);
  }
}
