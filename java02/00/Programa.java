import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota do aluno: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a segunda nota do aluno: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a quantidade de faltas do aluno: ");
    int faltas = scanner.nextInt();

    double media = (nota1 + nota2) / 2;

    System.out.println("Média: " + media);

    if (faltas >= 10) {
      System.out.println("O aluno foi reprovado devido ao excesso de faltas.");
    } else if (media == 10) {
      System.out.println("O aluno foi aprovado com excelência!");
    } else if (media >= 7) {
      System.out.println("O aluno foi aprovado!");
    } else if (media >= 5) {
      System.out.println("O aluno está em recuperação.");
    } else {
      System.out.println("O aluno foi reprovado.");
    }

    scanner.close();
  }
}
