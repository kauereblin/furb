import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe21 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double bmi, weight, height;
  private static String classification;

  public static void main (String[] args) {
    System.out.println("Digite o peso em quilogramas do indivíduo:");
    weight = sc.nextDouble();
    System.out.println("Digite a altura em metros do indivíduo:");
    height = sc.nextDouble();

    bmi = weight / (height * height);

    if (bmi < 18.5) {
      classification = "Magreza";
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      classification = "Saudável";
    } else if (bmi >= 25 && bmi <= 29.9) {
      classification = "Sobrepeso";
    } else if (bmi >= 30 && bmi <= 34.9) {
      classification = "Obesidade Grau I";
    } else if (bmi >= 35 && bmi <= 39.9) {
      classification = "Obesidade Grau II (severa)";
    } else {
      classification = "Obesidade Grau III (mórbida)";
    }

    System.out.println("O indivíduo é classificado com: " + classification);

    sc.close();
  }
}
