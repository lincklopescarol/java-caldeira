import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor para hora, minuto e segundo em formato 12 horas: ");
        int hora = teclado.nextInt();
        int minuto = teclado.nextInt();
        int segundo = teclado.nextInt();

        int quantidadeSegundos = (hora * 3600) + (minuto * 60) + segundo;

        // 86400 é a quantidade de segundos em 1 dia
        int segundosPassados = 86400 - quantidadeSegundos;

        System.out.println("Essa é a quantidade de segundos passados: " + quantidadeSegundos);
        System.out.println("Esse é o valor dos segundos restantes até a meia-noite: " + segundosPassados);

    }
}
