package exercicio01;

import java.util.Stack;

public class PilhaLivros {
    public static void main(String[] args) {
        Stack<Livros> pilha = new Stack<>();
        Livros livroUm = new Livros("Amor e Gelato", "Romance");
        Livros livroDois = new Livros("Nárnia", "Fantasia");
        Livros livroTres = new Livros("Como eu era antes de você", "Romance");
        pilha.add(livroUm);
        pilha.add(livroDois);
        pilha.add(livroTres);

        System.out.println("O que tem na pilha: ");
        for (int i = 0; i < pilha.size(); i++) {
            Livros todosLivros = pilha.get(i);
            System.out.println("Livro: " + todosLivros.getTitulo() + ", Categoria: " + todosLivros.getCategoria());
        }
        String categoria = "Romance";
        System.out.println("");

        System.out.println("Livros da categoria Romance: ");
        for (int i = 0; i < pilha.size(); i++) {
            Livros todosLivros = pilha.get(i);
            if (todosLivros.getCategoria().equals(categoria))
            System.out.println("Livro: " + todosLivros.getTitulo());
        }
        System.out.println("");
       
        while(pilha.size() > 0){
          Livros removidos = pilha.pop();
            System.out.println("Livros removidos: " + removidos.getTitulo());
        }

    }
}
