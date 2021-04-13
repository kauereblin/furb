import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Uni4Exe27 {
  final private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
  private static String arrival, leaving;
  private static int arrivalHour, arrivalMin, leavingHour, leavingMin, difHours, difMins, totalHours;
  private static String[] timeArrival, timeLeaving;
  private static double payment;

  public static void main (String[] args) {
    System.out.println("Digite o horário de chegada:");
    arrival = sc.nextLine();
    timeArrival = arrival.split(" ");
    arrivalHour = Integer.parseInt(timeArrival[0]);
    arrivalMin = Integer.parseInt(timeArrival[1]);

    System.out.println("Digite o horário de saída:");
    leaving = sc.nextLine();
    timeLeaving = leaving.split(" ");
    leavingHour = Integer.parseInt(timeLeaving[0]);
    leavingMin = Integer.parseInt(timeLeaving[1]);

    if (leavingHour * 60 + leavingMin < arrivalHour * 60 + arrivalMin) {
      difHours = Math.abs(leavingHour - arrivalHour + 24);
      difMins = Math.abs(leavingMin - arrivalMin);
    } else {
      difHours = Math.abs(leavingHour - arrivalHour);
      difMins = Math.abs(leavingMin - arrivalMin);
    }

    if (arrivalHour > 23 || arrivalMin > 59 ||
        leavingHour > 23 || leavingMin > 59 ||
        arrivalHour < 0 || arrivalMin < 0 ||
        leavingHour < 0 || leavingMin < 0) {
      System.out.println("Dados incorretos");
    } else if (difHours == 0 && difMins < 30) {
      totalHours = difHours + 1;
    } else if (difHours == 0 && difMins >= 30) {
      totalHours = difHours + 1;
    } else if (difHours > 0 && difMins >= 30) {
      totalHours = difHours + 1;
    } else {
      totalHours = difHours;
    }

    switch (totalHours) {
      case 1:
        payment = totalHours * 5.0;
        break;
      case 2:
        payment = totalHours * 5.0;
        break;
      case 3:
        payment = totalHours * 7.5;
        break;
      case 4:
        payment = totalHours * 7.5;
        break;
      case 5:
        payment = totalHours * 10.0;
        break;
      default:
        payment = totalHours * 10.0;
        break;
    }

    System.out.println("Total a pagar: " + payment);

    sc.close();
  }
}
