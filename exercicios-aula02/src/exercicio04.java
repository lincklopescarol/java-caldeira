import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            double primeiroNumero = teclado.nextDouble();

            System.out.println("Digite outro número");
            double segundoNumero = teclado.nextDouble();

            System.out.println("Selecione a operação que deseja realizar: ");
            System.out.println("1. Adição, 2. Subtração, 3. Multiplicação, 4. Divisão: ");


            int operacao = teclado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(primeiroNumero + segundoNumero);
                    break;
                case 2:
                    System.out.println(primeiroNumero - segundoNumero);
                    break;
                case 3:
                    System.out.println(primeiroNumero * segundoNumero);
                    break;
                case 4:
                    System.out.println(primeiroNumero / segundoNumero);
                    break;
                default:
                    System.out.println("Entrada inválida. Tente novamente!");
                    break;
            }
            System.out.println("Deseja continuar? Se quiser continuar digite 's', se quiser parar digite 'n': ");
            String continuacao = teclado.next();
            if (continuacao.equals("n")) {
                System.out.println("O programa foi finalizado.");
                break;
            }
        }
        while (true);
    }
}

