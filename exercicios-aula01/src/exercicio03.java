import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valorUm = teclado.nextInt();

        System.out.println("Digite um segundo valor: ");
        int valorDois = teclado.nextInt();

        System.out.println("Digite um terceiro valor: ");
        int valorTres = teclado.nextInt();

        int maior = Math.max(valorUm, Math.max(valorDois, valorTres));
        int menor = Math.min(valorUm, Math.min(valorDois, valorTres));

        double media = (valorUm + valorDois + valorTres) / 3;
        System.out.println("O maior valor é " + maior + ", o menor valor é " + menor + " e a média dos valores é de: " + media);
        }
    }

