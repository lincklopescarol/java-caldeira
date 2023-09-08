import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo: ");
        //1.320
        double salarioMinimo = teclado.nextDouble();

        System.out.println("Digite o valor do seu salário:");
        double salarioPessoa = teclado.nextDouble();

        double quantidadeSalariosMinimos = salarioPessoa / salarioMinimo;
        System.out.println("A quantidade de salários mínimos que você recebe de acordo com seu salário é de: " + quantidadeSalariosMinimos);

    }

}

