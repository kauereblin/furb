import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe11 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int age1, age2, age3;

  public static void main (String[] args) {
    age1 = sc.nextInt();
    age2 = sc.nextInt();
    age3 = sc.nextInt();

    if (age1 == age2 && age1 == age3) {
      System.out.println("São TRIGÊMIOS");
    } else if (age1 == age2 || age1 == age3 || age2 == age3) {
      System.out.println("São GÊMIOS");
    } else {
      System.out.println("São APENAS IRMÃOS");
    }

    sc.close();
  }
}
