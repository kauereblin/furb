import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe16 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String gender;
  private static int qttMale, qttFemale;
  private static double height, avgMaleHeight, avgFemaleHeight;

  public static void main (String[] args) {
    System.out.print("Altura: ");
    height = sc.nextDouble();

    while (height != 0) {
      System.out.print("Sexo: ");
      gender = sc.next();

      if (gender.toUpperCase().equals("M")) {
        avgMaleHeight += height;
        qttMale++;
      } else if (gender.toUpperCase().equals("F")) {
        avgFemaleHeight += height;
        qttFemale++;
      }

      System.out.print("Altura: ");
      height = sc.nextDouble();
    }

    if (qttMale != 0)
      System.out.println("Altura media masculina: " + (avgMaleHeight / qttMale));
    else
      System.out.println("Altura media masculina: 0");

    if (qttFemale != 0)
      System.out.println("Altura media feminina: " + (avgFemaleHeight / qttFemale));
    else
      System.out.println("Altura media feminina: 0");

    sc.close();
  }
}
