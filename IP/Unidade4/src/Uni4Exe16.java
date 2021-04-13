import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe16 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int ageMan1, ageMan2, ageWoman1, ageWoman2, oldMan, oldWoman, youngMan, youngWoman, sum, product;

  public static void main (String[] args) {
    System.out.println("Digite as idades dos homens:");
    ageMan1 = sc.nextInt();
    ageMan2 = sc.nextInt();
    System.out.println("Digite as idades das mulheres:");
    ageWoman1 = sc.nextInt();
    ageWoman2 = sc.nextInt();

    oldMan = ageMan1;
    youngMan = ageMan2;
    oldWoman = ageWoman1;
    youngWoman = ageWoman2;

    if (ageMan2 > ageMan1) {
      oldMan = ageMan2;
      youngMan = ageMan1;
    }

    if (ageWoman2 > ageWoman1) {
      oldWoman = ageWoman2;
      youngWoman = ageWoman1;
    }

    sum = oldMan + youngWoman;
    product = oldWoman * youngMan;

    System.out.println("A soma da idade do homem mais velho com a mulher mais nova é " + sum);
    System.out.println("A soma da idade da mulher mais velha com o homem mais novo é " + product);

    sc.close();
  }
}
