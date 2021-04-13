import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1005 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("0.00000");
  private static double A, B, media;

  public static void main(String[] args) {
    A = sc.nextDouble();
    B = sc.nextDouble();
    A *= 3.5;
    B *= 7.5;
    media = (A + B) / 11;

    System.out.println("MEDIA = " + df.format(media));

    sc.close();
  }
}
