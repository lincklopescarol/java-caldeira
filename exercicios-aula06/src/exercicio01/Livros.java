package exercicio01;

public class Livros {
    private String titulo;
    private String categoria;

    public Livros(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }
}
