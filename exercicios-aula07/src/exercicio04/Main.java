import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ImplementarCalculavel implementarCalculavel = new ImplementarCalculavel();

        try {
            System.out.println("Digite um número inteiro: ");
            int primeiraEntrada = teclado.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int segundaEntrada = teclado.nextInt();

            System.out.println("Digite a operação que deseja: ADICIONAR, SUBTRAIR, MULTIPLICAR OU DIVIDIR: ");
            Operacao operacao = Operacao.valueOf(teclado.next());

            int resposta = 0;
            switch (operacao) {
                case ADICIONAR:
                    resposta = implementarCalculavel.adicionar(primeiraEntrada, segundaEntrada);
                    break;
                case SUBTRAIR:
                    resposta = implementarCalculavel.subtrair(primeiraEntrada, segundaEntrada);
                    break;
                case MULTIPLICAR:
                    resposta = implementarCalculavel.multiplicar(primeiraEntrada, segundaEntrada);
                    break;
                case DIVIDIR:
                    resposta = implementarCalculavel.dividir(primeiraEntrada, segundaEntrada);
                    break;
            }
            System.out.println("Resposta da operação: " + resposta);

        } catch (InputMismatchException exception) {
            System.out.println("Digite apenas números inteiros.");
        }

        catch (IllegalArgumentException exception) {
            System.out.println("A operação que você digitou é invalida. Tente novamente!");
        }

    }
}

