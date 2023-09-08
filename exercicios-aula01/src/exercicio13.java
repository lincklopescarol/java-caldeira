import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = teclado.nextInt();
        int fatorial = 1;

        for(int i = 1; i<= numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial do número que você digitou anteriormente é: " + fatorial);
    }
}
