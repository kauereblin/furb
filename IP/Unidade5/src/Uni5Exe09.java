import java.util.Scanner;

public class Uni5Exe09 {
  final private static Scanner sc = new Scanner(System.in);
  private static String name;
  private static int students, age, aboveTwenty;

  public static void main (String[] args) {
    students = sc.nextInt();

    for (int i = 0; i < students; i++) {
      name = sc.next();
      age = sc.nextInt();

      if (age == 18) {
        System.out.println(name);
      }

      if (age > 20) {
        aboveTwenty++;
      }
    }

    System.out.println(aboveTwenty);

    sc.close();
  }
}
