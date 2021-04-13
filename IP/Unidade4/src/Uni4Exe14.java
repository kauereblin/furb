import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe14 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String date;
  private static int year, month, day;
  private static String[] dateSpliter;

  public static void main (String[] args) {
    System.out.println("Digite uma data para ver se existe (AAAA-MM-DD):");
    date = sc.next();

    dateSpliter = date.split("-");
    year = Integer.parseInt(dateSpliter[0]);
    month = Integer.parseInt(dateSpliter[1]);
    day = Integer.parseInt(dateSpliter[2]);

    if (day < 1 || day > 31 || month < 0 || month > 12) {
      System.out.println("Data incorreta!");
      return;
    } else if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
      if (month == 2 && day > 29) {
        System.out.println("Data incorreta!");
        return;
      } else {
        System.out.println("Data correta!");
        return;
      }
    }

    if (month < 8) {
      if (month % 2 == 0) {
        if (month == 2 && day > 28) {
          System.out.println("Data incorreta!");
          return;
        } else if (day < 31) {
          System.out.println("Data correta!");
          return;
        } else {
          System.out.println("Data incorreta!");
        }
      } else if (month % 2 == 1 && day < 32) {
        System.out.println("Data correta!");
      } else {
        System.out.println("Data correta!");
      }
    } else {
      if (month % 2 == 0 && day < 32) {
          System.out.println("Data correta!");
          return;
      } else if (month % 2 == 1 && day < 31) {
        System.out.println("Data correta!");
      } else {
        System.out.println("Data incorreta!");
      }
    }

    sc.close();
  }
}
