import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do teclado
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt(); // Lê o número fornecido pelo usuário

    // Verifica se o número é maior que 100
    if (numero > 100) {
      System.out.println("O número digitado é maior do que 100.");
    } else {
      System.out.println("O número digitado não é maior do que 100.");
    }

    // Fecha o Scanner para liberar os recursos
    scanner.close();
  }
}
