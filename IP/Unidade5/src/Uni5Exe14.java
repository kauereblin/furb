import java.util.Scanner;

public class Uni5Exe14 {
  final private static Scanner sc = new Scanner(System.in);
  private static String nameMerch;
  private static int qtMerchLow, qtMerchMid, qtMerchHigh;
  private static double sellPrice, buyPrice, profit, totalSell, totalBuy, totalProfit;

  public static void main (String[] args) {
    for (int i = 0; i < 20; ++i) {
      nameMerch = sc.nextLine();
      sellPrice = sc.nextDouble();
      buyPrice = sc.nextDouble();

      profit = (sellPrice - buyPrice) / buyPrice * 100;

      if (profit < 10) {
        ++qtMerchLow;
      } else if (10 <= profit && profit <= 20) {
        ++qtMerchMid;
      } else {
        ++qtMerchHigh;
      }

      totalSell += sellPrice;
      totalBuy += buyPrice;
      totalProfit += profit;
    }

    System.out.println("Lucro < 10%: " + qtMerchLow);
    System.out.println("10% <= Lucro <= 20%: " + qtMerchMid);
    System.out.println("Lucro > 20%: " + qtMerchHigh);
    System.out.println();
    System.out.println("Valor total de venda: " + totalSell);
    System.out.println("Valor total de compra: " + totalBuy);
    System.out.println("Valor de lucro: " + totalProfit);

    sc.close();
  }
}
