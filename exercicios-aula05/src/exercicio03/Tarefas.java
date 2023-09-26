package exercicio03;

public class Tarefas {
    private String titulo;
    private String data;
    private String descricao;

    public Tarefas(String titulo, String data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getData(){
        return data;
    }
    public String getDescricao(){
        return descricao;
    }
}

