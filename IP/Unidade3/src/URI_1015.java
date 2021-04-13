import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class URI_1015 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("#.0000");
  private static String input0, input1;
  private static String[] inputed0, inputed1;
  private static double px0, px1, py0, py1, difx, dify, distance;

  public static void main(String[] args) {
    input0 = sc.nextLine();
    input1 = sc.nextLine();

    inputed0 = input0.split(" ");
    inputed1 = input1.split(" ");

    px0 = Double.parseDouble(inputed0[0]);
    py0 = Double.parseDouble(inputed0[1]);
    px1 = Double.parseDouble(inputed1[0]);
    py1 = Double.parseDouble(inputed1[1]);

    difx = Math.pow((px1 - px0), 2);
    dify = Math.pow((py1 - py0), 2);

    distance = Math.pow(difx + dify, 0.5);

    System.out.println(df.format(distance));

    sc.close();
  }
}
