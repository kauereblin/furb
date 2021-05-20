import java.util.Scanner;

public class Uni6Exe09 {
  final private static Scanner sc = new Scanner(System.in);

  public static void main (String[] args) {
    int genders[] = new int[30];
    double note[] = new double[30];
    int age[] = new int[30];

    double dValue = 0;
    int iValue = 0;

    for (int i = 0; i < 30; i++) {
      iValue = sc.nextInt();
      genders[i] = iValue;
      dValue = sc.nextDouble();
      note[i] = dValue;
      iValue = sc.nextInt();
      age[i] = iValue;
    }

    double avg = 0;

    int qttMans = 0;
    double manAvg = 0;

    int youngLady = 1000000;
    double noteYoungLady = 0;

    int above50Ladies = 0;

    for (int i = 0; i < 30; i++) {
      avg = note[i];

      if (genders[i] == 2) {
        manAvg = note[i];
        qttMans++;
      }

      if (genders[i] == 1 && age[i] < youngLady) {
        noteYoungLady = note[i];
        youngLady = age[i];
      }

      if (genders[i] == 1 && age[i] >= 50 && note[i] > avg) {
        above50Ladies++;
      }
    }

    avg /= 30;
    manAvg /= qttMans;

    System.out.println("Media: " + avg);
    System.out.println("Media atribuida pelos homens: " + manAvg);
    System.out.println("Nota da mulher mais nova: " + noteYoungLady);
    System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota acima da media" + above50Ladies);

    sc.close();
  }
}
