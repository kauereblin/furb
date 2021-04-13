import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe20 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double gt1, gt2, gt3, ge, avg;
  private static String concept, result;

  public static void main (String[] args) {
    System.out.println("Digite as três notas de prova a seguir:");
    gt1 = sc.nextDouble();
    gt2 = sc.nextDouble();
    gt3 = sc.nextDouble();
    System.out.println("Digite a nota de exercícios a seguir:");
    ge = sc.nextDouble();

    avg = (gt1 + gt2 * 2 + gt3 * 3 + ge) / 7;

    if (avg >= 9) {
      concept = "A";
    } else if (avg >= 7.5 && avg < 9) {
      concept = "B";
    } else if (avg >= 6 && avg < 7.5) {
      concept = "C";
    } else if (avg >= 4 && avg < 6) {
      concept = "D";
    } else if (avg <= 4) {
      concept = "E";
    } else {
      concept = "F";
    }

    if (concept == "A" || concept == "B" || concept == "C") {
      result = "aprovado";
    } else if (concept == "D" || concept == "E") {
      result = "reprovado";
    }

    System.out.println("Média: " + avg);
    System.out.println("Conceito: " + concept);
    System.out.println(result);

    sc.close();
  }
}
