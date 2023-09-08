import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você é PCD, Gestante, Idosa ou Nenhuma das alternativas?");
        String resposta = teclado.nextLine();

        if(resposta.equals("PCD") || resposta.equals("Gestante") || resposta.equals("Idosa")){
            System.out.println("Você tem direito a fila prioritária");
        } else {
            System.out.println("Você não tem dinheiro a fila prioritária");
        }
    }
}
