package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Compra> listaDeCompras = new ArrayList<>();

        // adicionando compras para testar
        Compra compraUm = new Compra("Arroz", "20/08", 10.00);
        Compra compraDois = new Compra("Feijão", "10/09", 5.00);
        Compra compraTres = new Compra("Massa", "20/10", 08.00);

        listaDeCompras.add(compraUm);
        listaDeCompras.add(compraDois);
        listaDeCompras.add(compraTres);

        boolean fechamentoDoPrograma = true;

        while (fechamentoDoPrograma = true) {
            System.out.println("Digite '1' para adicionar itens na lista; '2' para remover itens da lista; '3' para mostrar uma lista com todas as compras; '4' para encerrar o programa. ");

            int respostaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (respostaUsuario) {
                case 1:
                    System.out.println("Escreva o nome do produto: ");
                    String produto = teclado.nextLine();
                    System.out.println("Escreva a categoria do produto: ");
                    String categoria = teclado.nextLine();
                    System.out.println("Escreva o valor do produto: ");
                    double valor = teclado.nextDouble();

                    Compra compraNova = new Compra(produto, categoria, valor);
                    listaDeCompras.add(compraNova);
                    break;
                case 2:
                    System.out.println("Digite o número da compra que deseja remover: ");
                    int numeroDaCompra = teclado.nextInt();
                    if (numeroDaCompra >= 1 && numeroDaCompra <= listaDeCompras.size()) {
                        listaDeCompras.remove(numeroDaCompra - 1);
                        break;
                    }
                case 3:
                    System.out.println("Lista de compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        Compra novaCompra = listaDeCompras.get(i);
                        System.out.println("Produto: " + novaCompra.getProduto() + ", Data Validade: " + novaCompra.getDataValidade() + ", Valor: " + novaCompra.getValor());
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

