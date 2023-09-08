import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura: ");
        int celsius = teclado.nextInt();

        int fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
