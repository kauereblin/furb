import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe24 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int option;
  public static double n1, n2, n3, greater, mid, smoll;

  public static void main (String[] args) {
    System.out.println("Digite 3 valores:");
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    System.out.println("Digite uma opção de 1 a 3:");
    option = sc.nextInt();

    greater = n1;
    mid = n2;
    smoll = n3;

    if (n1 > n2 && n1 > n3) {
      if (n3 >= n2) {
        mid = n3;
        smoll = n2;
      }
    } else if (n2 > n1 && n2 > n3) {
      if (n1 >= n3) {
        greater = n2;
        mid = n1;
        smoll = n3;
      } else if (n3 >= n1) {
        greater = n2;
        mid = n3;
        smoll = n1;
      }
    } else if (n3 > n1 && n3 > n2) {
      if (n1 >= n2) {
        greater = n3;
        mid = n1;
        smoll = n2;
      } else if (n2 >= n1) {
        greater = n3;
        smoll = n1;
      }
    }

    switch (option) {
      case 1:
        System.out.println(smoll + ", " + mid + ", " + greater);
        break;
      case 2:
        System.out.println(greater + ", " + mid + ", " + smoll);
        break;
      case 3:
        System.out.println(smoll + ", " + greater + ", " + mid);
        break;
      default:
        System.out.println("Opção inválida");
    }

    sc.close();
  }
}
