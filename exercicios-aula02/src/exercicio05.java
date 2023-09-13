import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou uma frase: ");
        String entrada = teclado.nextLine();
        int quantidadeCaracteres = entrada.length();
        int divisaoString = quantidadeCaracteres / 2;

        System.out.println(entrada.substring(0,(divisaoString)));;
    }
}
