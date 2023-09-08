import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valorUm = teclado.nextInt();

        System.out.println("Digite outro valor: ");
        int valorDois = teclado.nextInt();

        System.out.println("O primeiro valor digitado foi: " + valorUm + " e o segundo valor foi: " + valorDois);
    }
}
