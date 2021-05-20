import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe17 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int registrationNumber, maxNumber, minNumber, qttAthlete;
  private static double height, avgHeight, maxHeight = 0, minHeight = 100000;

  public static void main (String[] args) {
    System.out.print("Numero de inscricao: ");
    registrationNumber = sc.nextInt();

    while (registrationNumber != 0) {
      System.out.print("Altura do atleta: ");
      height = sc.nextDouble();

      if (height > maxHeight) {
        maxNumber = registrationNumber;
        maxHeight = height;
      } else if (height < minHeight) {
        minNumber = registrationNumber;
        minHeight = height;
      }

      avgHeight += height;
      ++qttAthlete;

      System.out.print("Numero de inscricao: ");
      registrationNumber = sc.nextInt();
      System.out.println();
    }

    System.out.println("Atleta com maior altura: " + maxNumber);
    System.out.println("Com: " + maxHeight + " metros");
    System.out.println("Atleta com menor altura: " + minNumber);
    System.out.println("Com: " + minHeight + " metros");
    System.out.println("Media de altura da competicao: " + (avgHeight / qttAthlete));

    sc.close();
  }
}
