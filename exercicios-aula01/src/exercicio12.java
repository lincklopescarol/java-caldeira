import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor em reais: ");
        double quantia = teclado.nextDouble();
        System.out.println("Digite o valor do câmbio do dólar: ");
        double cambioAtual = teclado.nextDouble();

        double valorConvertido = quantia / cambioAtual;
        System.out.println("O valor convertido é de reais para dólares é de: " + valorConvertido);
    }
}
