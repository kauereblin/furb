import java.util.Scanner;

public class Uni5Exe15 {
  final private static Scanner sc = new Scanner(System.in);
  private static String nameStudent;
  private static double grade1, grade2;

  public static void main (String[] args) {
    System.out.print("Estudante: ");
    nameStudent = sc.next();

    while (!nameStudent.equals("fim")) {
      grade1 = sc.nextDouble();
      grade2 = sc.nextDouble();

      System.out.println("Estudante: " + nameStudent);
      System.out.println("Media: " + (grade1 + grade2) / 2);

      System.out.print("Estudante: ");
      nameStudent = sc.next();
    }

    sc.close();
  }
}
