import java.util.Scanner;

public class Uni3Exe15 {
  final private static Scanner sc = new Scanner(System.in);
  private static int total, hundred, dozen, unit;

  public static void main (String[] args) {
    total = sc.nextInt();

    hundred = total / 100;
    total -= hundred * 100;

    dozen = total / 10;

    unit = total % 10;

    System.out.println(hundred + " centena(s) " + dozen + " dezena(s) " + unit + " unidade(s)");

    sc.close();
  }
}
