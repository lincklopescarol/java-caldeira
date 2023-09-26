package exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

public class FilaImpressao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        LinkedList<Impressao> lista = new LinkedList<>();

        // testando impressao para testar
        Impressao impressaoUm = new Impressao("Carol", 20);
        lista.add(impressaoUm);

        boolean fechamentoDoPrograma = true;

        while (fechamentoDoPrograma = true){
            System.out.println("Digite '1' para adicionar itens na impressão; '2' para listar itens da impressão; '3' encerrar o programa");

            int respostaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (respostaUsuario){
                case 1:
                    System.out.println("Escreva o nome para fazer a impressão: ");
                    String nome = teclado.nextLine();
                    System.out.println("Escreva o número de páginas: ");
                    int numeroPaginas = teclado.nextInt();

                    Impressao novaImpressao = new Impressao(nome, numeroPaginas);
                    lista.add(novaImpressao);
                    break;
                case 2:
                    System.out.println("Lista de impressões:");
                    for (int i = 0; i < lista.size(); i++){
                        Impressao todasImpressoes = lista.get(i);
                        System.out.println("Nome: " + todasImpressoes.getNome() + ", Número de páginas: " + todasImpressoes.getNumeroPaginas());
                    }
                    break;
                case 3:
                    fechamentoDoPrograma = false;
                    System.out.println("Encerrado.");
                default:
                    System.out.println("Erro!");
            }
        }

    }
}
