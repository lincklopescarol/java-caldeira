import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esse é um jogo de adivinhação! " +
                "Escreva um número inteiro para palpitar quantos inimigos os soldados irão combater: ");
        int palpite = teclado.nextInt();

        if (palpite < 300000){
            System.out.println("Um pouco mais!");
        } else {
            System.out.println("Um pouco menos!");
        }
    }
}
