import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("A idade que você inseriu está inválida!");
            }
            System.out.println("Sua idade: " + idade);
        } catch (IdadeInvalidaException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
