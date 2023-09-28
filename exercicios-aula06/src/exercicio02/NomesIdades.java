package exercicio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NomesIdades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Integer> nomesIdades = new HashMap<>();
        nomesIdades.put("Carol", 19);
        nomesIdades.put("Vitória", 20);
        nomesIdades.put("Júlia", 65);
        nomesIdades.put("Roberta", 60);

        System.out.println("Digite um nome: ");
        String respostaUsuario = teclado.nextLine();

        if (nomesIdades.containsKey(respostaUsuario)) {
            System.out.println("Nome encontrado.");
            System.out.println("A idade da pessoa com esse nome é: ");
            System.out.println(nomesIdades.get(respostaUsuario));

        } else {
            System.out.println("Nome não encontrado.");
        }
        System.out.println("");
        System.out.println("Lista de nomes de pessoas na terceira idade: ");
        terceiraIdade(nomesIdades);
    }

    private static void terceiraIdade(Map<String, Integer> nomesIdades) {
        // usei for each pq é o mais recomendado com mapa
        nomesIdades.forEach((nome, idade) -> {
            if (idade >= 60) {
                System.out.println(nome);
            }

        });
    }
}





