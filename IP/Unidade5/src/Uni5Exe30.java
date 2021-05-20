import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe30 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int N, K, M, sumIn, sumOut;
  public static void main (String[] args) {
    N = sc.nextInt();
    K = sc.nextInt();
    M = sc.nextInt();

    while (N - K >= 0) {
      System.out.println(N + " pode ser colocado");

      if (N <= M) {
        System.out.println(N + " entrou");
        M -= N;
        sumIn += N;
      } else if (N > M) {
        System.out.println(N + " ficou de fora");
        sumOut += N;
      }

      N -= K;
    }
    System.out.println("Soma dos de dentro: " + sumIn);
    System.out.println("Soma dos de fora: " + sumOut);

    sc.close();
  }
}
