import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoAtual = 2023;
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos de idade");
    }
}
