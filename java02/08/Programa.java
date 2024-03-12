import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que insira os três números
    System.out.println("Insira três números:");
    System.out.print("Número 1: ");
    double num1 = scanner.nextDouble();
    System.out.print("Número 2: ");
    double num2 = scanner.nextDouble();
    System.out.print("Número 3: ");
    double num3 = scanner.nextDouble();

    // Variáveis temporárias para armazenar os números durante a troca
    double temp;

    // Ordena os números em ordem crescente
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    // Exibe os números em ordem crescente
    System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);

    scanner.close();
  }
}
