import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1012 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("0.000");
  private static String input;
  private static String[] inputed;
  private static double A, B, C, tri, cir, trpz, sqr, rtng;

  public static void main(String[] args) {
    input = sc.nextLine();

    inputed = input.split(" ");

    A = Double.parseDouble(inputed[0]);
    B = Double.parseDouble(inputed[1]);
    C = Double.parseDouble(inputed[2]);

    tri = A * C / 2;
    cir = C * C * 3.14159;
    trpz = (A + B) * C / 2;
    sqr = B * B;
    rtng = A * B;

    System.out.println("TRIANGULO: " + df.format(tri));
    System.out.println("CIRCULO: " + df.format(cir));
    System.out.println("TRAPEZIO: " + df.format(trpz));
    System.out.println("QUADRADO: " + df.format(sqr));
    System.out.println("RETANGULO: " + df.format(rtng));

    sc.close();
  }
}
