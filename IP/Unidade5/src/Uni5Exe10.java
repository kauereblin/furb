import java.util.Scanner;

public class Uni5Exe10 {
  private static String sNumber, first, second;
  private static int hundreds, units, power, foundNumbers;

  public static void main (String[] args) {
    for (int i = 10; i < 100000000 && foundNumbers < 10; i++) {
      sNumber = "" + i;

      final int mid = sNumber.length() / 2;

      String[] asNumber = {sNumber.substring(0, mid), sNumber.substring(mid)};

      first = asNumber[0];
      second = asNumber[1];

      hundreds = Integer.parseInt(first);
      units = Integer.parseInt(second);

      power = hundreds + units;

      if (power * power == i) {
        System.out.println(i);
        foundNumbers++;
      }
    }
  }
}
