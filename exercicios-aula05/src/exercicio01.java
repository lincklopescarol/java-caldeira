import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] cincoNumeros = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            cincoNumeros[i] = teclado.nextDouble();
        }

        for (int i = 0; i < cincoNumeros.length; i++) {
            soma = soma + cincoNumeros[i];
        }
        double media = soma / cincoNumeros.length;
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);
    }

}

