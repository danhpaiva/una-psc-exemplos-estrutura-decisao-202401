import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do teclado
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt(); // Lê o número fornecido pelo usuário

    // Verifica se o número é par
    if (numero % 2 == 0) {
      System.out.println(numero + " é um número par.");
    } else {
      System.out.println(numero + " não é um número par.");
    }

    // Fecha o Scanner para liberar os recursos
    scanner.close();
  }
}
