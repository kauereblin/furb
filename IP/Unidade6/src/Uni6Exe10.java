import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Uni6Exe10 {
  final private Scanner sc = new Scanner(System.in);
  final private int vectorLimit = 50;
  private ArrayList<Integer> vector = new ArrayList<Integer>();

  private Uni6Exe10 () {
    int option = 0;

    do {
      showMenu();
      option = sc.nextInt();

      switch (option) {
        case 1:
          includeValue();
          break;

        case 2:
          searchValue();
          break;

        case 3:
          changeValue();
          break;

        case 4:
          deleteValue();
          break;

        case 5:
          showValues();
          break;

        case 6:
          sortValues();
          break;
      }

    } while (option != 7);

    sc.close();
  }

  private void showMenu () {
    System.out.println("1. Incluir valor");
    System.out.println("2. Pesquisar valor");
    System.out.println("3. Alterar valor");
    System.out.println("4. Excluir valor");
    System.out.println("5. Mostrar valores");
    System.out.println("6. Ordenar valores");
    System.out.println("7. Sair do sistema");
  }

  private void includeValue () {
    int value = 0;
    System.out.print("Valor a ser incluido: ");
    value = sc.nextInt();

    if (vector.size() < vectorLimit) {
      vector.add(value);
      System.out.println("Valor inserido!");
    } else {
      System.out.println("Valor nao inserido!");
    }
  }

  private void searchValue () {
    int value = 0;
    System.out.print("Valor a ser encontrado: ");
    value = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < vector.size(); i++) {
      if (value == vector.get(i)) {
        found = true;
      }
    }

    if (found) {
      System.out.println("O valor existe no vetor!");
    } else {
      System.out.println("O valor nao existe no vetor!");
    }
  }

  private void changeValue () {
    int value = 0;
    System.out.print("Valor a ser alterado: ");
    value = sc.nextInt();
    int newValue = 0;
    System.out.print("Novo valor: ");
    newValue = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < vector.size(); i++) {
      if (vector.get(i) == value && !found) {
        vector.set(i, newValue);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("numero nao encontrado!");
    }
  }

  private void deleteValue () {
    int value = 0;
    System.out.print("Valor a ser deletado: ");
    value = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < vector.size(); i++) {
      if (vector.get(i) == value && !found) {
        vector.remove(i);
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Numero removido!");
    } else {
      System.out.println("Numero nao removido!");
    }
  }

  private void showValues () {
    for (int i = 0; i < vector.size(); i++) {
      System.out.print(vector.get(i) + " ");
    }
  }

  private void sortValues () {
    Collections.sort(vector);
  }

  public static void main (String[] args) {
    new Uni6Exe10();
  }
}
