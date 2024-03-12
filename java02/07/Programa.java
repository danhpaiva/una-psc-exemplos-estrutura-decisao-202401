import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que insira os três lados do triângulo
    System.out.println("Insira os três lados do triângulo:");
    System.out.print("Lado 1: ");
    double lado1 = scanner.nextDouble();
    System.out.print("Lado 2: ");
    double lado2 = scanner.nextDouble();
    System.out.print("Lado 3: ");
    double lado3 = scanner.nextDouble();

    // Verifica o tipo do triângulo
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("O triângulo é equilátero.");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      System.out.println("O triângulo é isósceles.");
    } else {
      System.out.println("O triângulo é escaleno.");
    }

    scanner.close();
  }
}
