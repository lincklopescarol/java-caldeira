import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou uma frase: ");
        String resposta = teclado.nextLine();
        String vogais = "aeiou";

        int numeroVogais = 0;

        for (int i = 0; i < resposta.length(); i++) {
            // usei para percorrer cada letra da resposta do usuário
            char letras = resposta.charAt(i);
            if (vogais.contains(String.valueOf(letras))) {
                numeroVogais++;
            }
        }
        System.out.println("O que você digitou tem o total de: " + numeroVogais + " vogais.");
    }
}
