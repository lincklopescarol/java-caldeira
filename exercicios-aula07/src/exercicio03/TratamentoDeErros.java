import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiraEntrada = 0;
        int segundaEntrada = 0;
        try {
            System.out.println("Digite um número inteiro: ");
            primeiraEntrada = teclado.nextInt();
            System.out.println("Digite outro número inteiro: ");
            segundaEntrada = teclado.nextInt();
            // pega o input
        } catch (InputMismatchException exception){
            System.out.println("Os dois números precisam ser inteiros, tente novamente.");
        }

    }
}
