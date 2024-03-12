import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Leitura do número inteiro
    System.out.println("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    // Verificação se o número é divisível por 5
    if (numero % 5 == 0) {
      // Exibir mensagem se o número é divisível por 5
      System.out.println("O número é divisível por 5!");
    } else {
      // Exibir mensagem se o número não é divisível por 5
      System.out.println("O número não é divisível por 5.");
    }
    scanner.close();
  }
}
