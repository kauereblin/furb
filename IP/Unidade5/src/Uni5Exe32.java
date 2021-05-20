import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe32 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static int weekSize = 7;
  private static int initPos, qttDays, day = 1;

  public static void main (String[] args) {
    System.out.print("Digite a posicao do primeiro dia: ");
    initPos = sc.nextInt();
    System.out.print("Digite a quantidade de dias: ");
    qttDays = sc.nextInt();

    System.out.println("D | S | T | Q | Q | S | S");

    int i = 0;
    while (i <= initPos) {
      System.out.print("   ");
      i++;
    }

    while (day <= qttDays) {
      if ((day + initPos - 2) % weekSize == 0) {
        System.out.println();
      }

      System.out.print(day + "  ");

      day++;
    }

    sc.close();
  }
}
