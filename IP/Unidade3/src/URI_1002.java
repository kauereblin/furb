import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
  final private static double pi = 3.14159;
  final private static DecimalFormat df = new DecimalFormat("00.0000");
  private static Scanner sc = new Scanner(System.in);
  private static double raio;
  private static double area;

  public static void main (String args[]) {
    raio = Double.parseDouble(sc.nextLine());
    area = pi * raio * raio;

    System.out.println("A=" + df.format(area));

    sc.close();
  }
}
