package exercicio06;

import java.util.LinkedList;
import java.util.Scanner;

public class SistemaReservaPassagens {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        LinkedList<Reserva> listaReserva = new LinkedList<>();

        // adicionando reserva para testar
        Reserva reservaUm = new Reserva("Carol", "Itália", "1010101010", "10/09", "20/09");
        listaReserva.add(reservaUm);

        boolean fechamentoPrograma = true;

        while (fechamentoPrograma == true) {
            System.out.println("Digite '1' para adicionar uma reserva; '2' para cancelar uma reserva; '3' para exibir uma lista com as reservas; 4' encerrar o programa");

            int respostaUsuario = teclado.nextInt();

            switch (respostaUsuario) {
                case 1:
                    System.out.println("Escreva seu nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Escreva o local: ");
                    String local = teclado.nextLine();
                    System.out.println("Escreva seu CPF: ");
                    String CPF = teclado.nextLine();
                    System.out.println("Escreva a data de entrada: ");
                    String dataEntrada = teclado.nextLine();
                    System.out.println("Escreva a data de saída: ");
                    String dataSaida = teclado.nextLine();

                    Reserva novaReserva = new Reserva(nome, local, CPF, dataEntrada, dataSaida);
                    listaReserva.add(novaReserva);
                    break;
                case 2:
                    System.out.println("Digite o número de uma reserva para deletar: ");
                    int numeroReserva = teclado.nextInt();
                    if (numeroReserva >= 1 && numeroReserva <= listaReserva.size()) {
                        listaReserva.remove(numeroReserva - 1);
                    }
                    break;
                case 3:
                    System.out.println("Lista de Reservas:");
                    for(int i = 0; i < listaReserva.size(); i++){
                        Reserva todasReservas = listaReserva.get(i);
                        System.out.println("Nome: " + listaReserva.element().getNome() + ", Local: " + listaReserva.element().getLocal() +
                                ", CPF: " + listaReserva.element().getCPF() + ", Data de entrada: " + listaReserva.element().getDataEntrada()
                        + ", Data saída: " + listaReserva.element().getDataSaida());
                    }
                    break;
                case 4:
                     fechamentoPrograma = false;
                    System.out.println("Encerrado.");
                    break;
                default:
                    System.out.println("Erro!");
            }
        }
    }
}
