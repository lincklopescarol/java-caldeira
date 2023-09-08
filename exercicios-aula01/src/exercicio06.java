import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        if(idade < 16){
            System.out.println("Você não pode votar");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("O voto é facultativo");
        } else {
            System.out.println("É obrigatório votar");
        }
    }
}
