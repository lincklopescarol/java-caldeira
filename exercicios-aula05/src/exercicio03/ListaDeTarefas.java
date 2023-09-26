package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

        // adicionando tarefas para testar
        Tarefas primeiraTarefa = new Tarefas("Casa", "26/09", "Arrumar a casa");
        Tarefas segundaTarefa = new Tarefas("Escola", "26/09", "Estudar");
        listaDeTarefas.add(primeiraTarefa);
        listaDeTarefas.add(segundaTarefa);

        boolean fechamentoDoPrograma = true;

        while (fechamentoDoPrograma = true) {

            System.out.println("Digite '1' para adicionar tarefa; '2' para remover tarefa; '3' para mostrar uma lista com todas as tarefas; '4' para encerrar o programa. ");

            int respostaUsuario = teclado.nextInt();
            // tive que colocar nextline pq se não dá erro no case 2
            teclado.nextLine();

            switch (respostaUsuario) {
                case 1:
                    System.out.println("Escreva o título da tarefa: ");
                    String titulo = teclado.nextLine();
                    System.out.println("Escreva a data da tarefa: ");
                    String data = teclado.nextLine();
                    System.out.println("Escreva a descrição da tarefa: ");
                    String descricao = teclado.nextLine();

                    Tarefas tarefaNova = new Tarefas(titulo, data, descricao);
                    listaDeTarefas.add(tarefaNova);
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover: ");
                    int numeroDaTarefa = teclado.nextInt();
                    if (numeroDaTarefa >= 1 && numeroDaTarefa <= listaDeTarefas.size()) {
                        listaDeTarefas.remove(numeroDaTarefa - 1);
                        break;
                    }
                case 3:
                    System.out.println("Lista de Tarefas:");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Tarefas novaTarefa = listaDeTarefas.get(i);
                        System.out.println("Título: " + novaTarefa.getTitulo() + ", Data: " + novaTarefa.getData() + ", Descrição: " + novaTarefa.getDescricao());
                    }
                    break;
                case 4:
                    fechamentoDoPrograma = false;
                    System.out.println("Encerrado.");
                default:
                    System.out.println("Erro!");
            }

        }
    }

}