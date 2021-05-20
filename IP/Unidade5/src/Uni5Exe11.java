import java.util.Scanner;

public class Uni5Exe11 {
  private static int totalCookies, cookies = 1;

  public static void main (String[] args) {
    for (int i = 1; i < 16; i++)
    {
      cookies *= 3;
      totalCookies += cookies;
    }

    System.out.println(++totalCookies);
  }
}
