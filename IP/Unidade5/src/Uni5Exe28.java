import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe28 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String vote = "s", mostVoted;
  private static int codeVote, ndnVotes, cpmVotes, skankVotes, jqVotes, totalVotes;

  public static void main (String[] args) {
    while(vote.equals("s")) {
      System.out.print("Digite o codigo do voto: ");
      codeVote = sc.nextInt();

      switch (codeVote) {
        case 1:
          ndnVotes++;
          break;

        case 2:
          cpmVotes++;
          break;

        case 3:
          skankVotes++;
          break;

        case 4:
          jqVotes++;
          break;

        default:
          System.out.println("Codigo invalido!");
          continue;
          //break;
      }

      totalVotes++;

      System.out.println("mais um voto: s (SIM) / n (NAO)?");
      vote = sc.next();
    }

    if (ndnVotes > cpmVotes && ndnVotes > skankVotes && ndnVotes > jqVotes)
      mostVoted = "Nenhum de Nos";
    else if (ndnVotes < cpmVotes && cpmVotes > skankVotes && cpmVotes > jqVotes)
      mostVoted = "CPM22";
    else if (ndnVotes < skankVotes && cpmVotes < skankVotes && skankVotes > jqVotes)
      mostVoted = "Skank";
    else if (ndnVotes < jqVotes && cpmVotes < jqVotes && skankVotes < jqVotes)
      mostVoted = "Jota Quest";
    else
      mostVoted = "Empate";

    System.out.println("Votos para Nenhum de Nos: " + ndnVotes + " = " + (double) ndnVotes / totalVotes * 100 + "%");
    System.out.println("Votos para CPM22: " + cpmVotes + " = " + (double) cpmVotes / totalVotes * 100 + "%");
    System.out.println("Votos para Skank: " + skankVotes + " = " + (double) skankVotes / totalVotes * 100 + "%");
    System.out.println("Votos para Jota Quest: " + jqVotes + " = " + (double) jqVotes / totalVotes * 100 + "%");

    System.out.println("Grupo com maior audiencia: " + mostVoted);

    sc.close();
  }
}
