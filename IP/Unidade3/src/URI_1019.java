import java.util.Locale;
import java.util.Scanner;

public class URI_1019 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int time, h, m, s;

  public static void main(String[] args) {
    time = sc.nextInt();

    while (time > 0) {
      if (time >= 3600) {
        time -= 3600;
        h++;
      } else if (time >= 60) {
        time -= 60;
        m++;
      } else if (time >= 1) {
        time -= 1;
        s++;
      }
    }


    System.out.println(h + ":" + m + ":" + s);

    sc.close();
  }
}
