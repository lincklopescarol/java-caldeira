package exercicio01;

import java.util.Stack;

public class PilhaLivros {
    public static void main(String[] args) {
        Stack<Livros> pilha = new Stack<>();
        Livros livroUm = new Livros("Amor e Gelato", "Romance");
        pilha.add(livroUm);

        System.out.println("O que tem na pilha: ");
        for(int i = 0; i < pilha.size(); i++){
            Livros todosLivros = pilha.get(i);
            System.out.println("Livro: " + todosLivros.getTitulo() + ", Categoria: " + todosLivros.getCategoria());

            // continuar a lógica
        }
    }
}
