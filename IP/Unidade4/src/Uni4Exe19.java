//  _   _  /\/|                              _                                       _           _
// | \ | ||/\/                              (_)                                     (_)         | |
// |  \| | __ _  ___    ___  ___  __ _ _   _ _    ___     ___ _ __  _   _ _ __   ___ _  __ _  __| | ___
// | . ` |/ _` |/ _ \  / __|/ _ \/ _` | | | | |  / _ \   / _ \ '_ \| | | | '_ \ / __| |/ _` |/ _` |/ _ \
// | |\  | (_| | (_) | \__ \  __/ (_| | |_| | | | (_) | |  __/ | | | |_| | | | | (__| | (_| | (_| | (_) |
// |_| \_|\__,_|\___/  |___/\___|\__, |\__,_|_|  \___/   \___|_| |_|\__,_|_| |_|\___|_|\__,_|\__,_|\___/
// Os quadrantes estão em ordem diferente da correta

import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe19 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static double x, y, quadrant;

  public static void main (String[] args) {
    System.out.println("Digite a coordenada no eixo x:");
    x = sc.nextDouble();
    System.out.println("Digite a coordenada no eixo y:");
    y = sc.nextDouble();

    if (x == 0 && y == 0) {
      quadrant = 0;
    } else if (x > 0 && y > 0) {
      quadrant = 1;
    } else if (x < 0 && y > 0) {
      quadrant = 2;
    } else if (x < 0 && y < 0) {
      quadrant = 3;
    } else if (x > 0 && y < 0) {
      quadrant = 4;
    }

    System.out.println("O ponto está no quadrante " + quadrant);
    sc.close();
  }
}
