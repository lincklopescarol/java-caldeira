import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para começo do intervalo: ");
        int comecoIntervalo = teclado.nextInt();
        System.out.println("Digite um número para o final do intervalo: ");
        int finalIntervalo = teclado.nextInt();

        for (int i = comecoIntervalo; i <= finalIntervalo; i++) {
            boolean numeroPrimo = true;
            if (i > 1) {
                for (int a = 2; a < i; a++) {
                    if (i % a == 0) {
                        numeroPrimo = false;
                        break;
                    }
                }
            }
            if (numeroPrimo) {
                System.out.println(i);
            }
        }
    }
}


