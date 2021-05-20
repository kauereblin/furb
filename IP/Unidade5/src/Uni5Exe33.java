import java.util.Scanner;
import java.util.Locale;

public class Uni5Exe33 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static int vote, vote1, vote2, vote3, vote4, nullVote, blankVote, totalVotes;

  public static void main (String[] args) {
    do {
      System.out.print("Digite o voto: ");
      vote = sc.nextInt();

      switch (vote) {
        case 1: vote1++; break;
        case 2: vote2++; break;
        case 3: vote3++; break;
        case 4: vote4++; break;
        case 5: nullVote++; break;
        case 6: blankVote++; break;
        case 0: break;
        default: System.out.println("Opção incorreta"); break;
      }

    } while (vote != 0);

    totalVotes = vote1 + vote2 + vote3 + vote4 + nullVote + blankVote;

    System.out.println("Votos candidato 1: " + vote1);
    System.out.println("Votos candidato 2: " + vote2);
    System.out.println("Votos candidato 3: " + vote3);
    System.out.println("Votos candidato 4: " + vote4);
    System.out.println("Votos nulos: " + nullVote);
    System.out.println("Votos em branco: " + blankVote);
    System.out.println("Percentual nulos: " + (double) nullVote / totalVotes * 100. );
    System.out.println("Percentual brancos: " + (double) blankVote / totalVotes * 100.);

    sc.close();
  }
}
