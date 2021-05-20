import java.util.Scanner;

public class Uni6Exe05 {
  final private static Scanner sc = new Scanner(System.in);
  public static void main (String[] args) {
    String manResponses[] = new String[5];
    String womanResponses[] = new String[5];
    String resposta = "";

    System.out.println("1. Gosta de musica sertaneja?\n" +
    "Gosta de futebol?\n" +
    "Gosta de seriados?\n" +
    "Gosta de redes sociais?\n" +
    "Gosta da Oktoberfest?");


    for (int i = 0; i < 5; i++) {
      System.out.println("Homem: Digite a resposta para a pergunta " + (i + 1));
      resposta = sc.next().toUpperCase();
      manResponses[i] = resposta;
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("Mulher: Digite a resposta para a pergunta " + (i + 1));
      resposta = sc.next().toUpperCase();
      womanResponses[i] = resposta;
    }

    int afinity = 0;

    for (int i = 0; i < 5; i++) {
      if (manResponses[i].equals(womanResponses[i])) {
        afinity += 3;
      } else if (manResponses[i].equals("IND") && (womanResponses[i].equals("SIM") || womanResponses[i].equals("NÃO"))) {
        afinity++;
      } else if (womanResponses[i].equals("IND") && (manResponses[i].equals("SIM") || manResponses[i].equals("NÃO"))) {
        afinity++;
      } else {
        afinity -= 2;
      }
    }

    if (afinity == 15) {
      System.out.println("Casem!");
    } else if (afinity >= 10 && afinity <= 14) {
      System.out.println("Vocês tem muita coisa em comum!");
    } else if (afinity >= 5 && afinity <= 9) {
      System.out.println("Talvez nao de certo :(");
    } else if (afinity >= 0 && afinity <= 4) {
      System.out.println("Vale um encontro.");
    } else if (afinity >= - 1 && afinity <= - 9) {
      System.out.println("Melhor nao perder tempo");
    } else {
      System.out.println("Voces se odeiam!");
    }

    sc.close();
  }
}
