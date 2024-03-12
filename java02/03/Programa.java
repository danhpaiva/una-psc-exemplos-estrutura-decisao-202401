import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Senha do sistema
    String senhaSistema = "programacao";

    // Leitura da senha digitada pelo usuário
    System.out.println("Digite sua senha: ");
    String senhaDigitada = scanner.nextLine();

    // Conversão das senhas para minúsculas
    senhaSistema = senhaSistema.toLowerCase();
    senhaDigitada = senhaDigitada.toLowerCase();

    // Comparação das senhas
    if (senhaSistema.equals(senhaDigitada)) {
      System.out.println("Senha válida!");
    } else {
      System.out.println("Senha inválida!");
    }
    scanner.close();
  }
}
