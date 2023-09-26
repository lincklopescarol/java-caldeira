import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numerosAleatorios = new int[100];

        for (int i = 0; i < 100; i++){
            numerosAleatorios[i] = (int) (Math.random() * 100) + 1;
            System.out.println(numerosAleatorios[i]);
        }

        System.out.println("Digite um número: ");
        int respostaUsuario = teclado.nextInt();
        boolean numeroIgual = false;

        for(int i = 0; i < numerosAleatorios.length; i++){
        if (numerosAleatorios[i] == respostaUsuario){
            numeroIgual = true;
            break;
        }
        }
        if (numeroIgual == true){
            System.out.println("O número foi encontrado.");
        } else {
            System.out.println("O número não foi encontrado. ");
        }
    }
}
