import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite seu salário: ");
        double salario = teclado.nextInt();

        if (idade >= 18 && salario > 2000){
            System.out.println("Você pode comprar um imóvel");
        } else {
            System.out.println("Você não pode comprar um imóvel");
        }
    }
}
