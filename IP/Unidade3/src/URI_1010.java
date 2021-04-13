import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1010 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  final private static DecimalFormat df = new DecimalFormat("####.00");
  private static String inputPiece0, inputPiece1;
  private static String[] input0, input1;
  private static String codPiece0, codPiece1;
  private static int numPieces0, numPieces1;
  private static double valuePiece0, valuePiece1, totalValue;

  public static void main(String[] args) {
    inputPiece0 = sc.nextLine();
    inputPiece1 = sc.nextLine();

    input0 = inputPiece0.split(" ");
    input1 = inputPiece1.split(" ");

    codPiece0 = input0[0];
    numPieces0 = Integer.parseInt(input0[1]);
    valuePiece0 = Double.parseDouble(input0[2]);
    codPiece1 = input1[0];
    numPieces1 = Integer.parseInt(input1[1]);
    valuePiece1 = Double.parseDouble(input1[2]);

    totalValue = (numPieces0 * valuePiece0) + (numPieces1 * valuePiece1);

    System.out.println("VALOR A PAGAR: R$ " + df.format(totalValue));

    sc.close();
  }
}
