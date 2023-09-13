import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou uma frase: ");
        String entrada = teclado.nextLine();
        String stringContraria = "";

        for (int i = entrada.length() - 1; i >= 0; i--){
            char letra = entrada.charAt(i);
            stringContraria = stringContraria + letra;
        }
        System.out.println(stringContraria);
    }
}
