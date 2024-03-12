import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lê os três números do teclado
    System.out.print("Digite o primeiro número: ");
    double numero1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double numero2 = scanner.nextDouble();

    System.out.print("Digite o terceiro número: ");
    double numero3 = scanner.nextDouble();

    // Calcula o maior número
    double maior = Math.max(numero1, Math.max(numero2, numero3));

    // Calcula o menor número
    double menor = Math.min(numero1, Math.min(numero2, numero3));

    // Calcula a média aritmética
    double media = (numero1 + numero2 + numero3) / 3;

    // Apresenta os resultados
    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    System.out.println("A média aritmética dos três números é: " + media);

    scanner.close();
  }
}
