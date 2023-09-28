package exercicio03;

public class Informacoes {
    private int numeroTelefone;
    private String nome;
    private String endereco;
    private String localCidade;

    public Informacoes(int numeroTelefone, String nome, String endereco, String localCidade) {
        this.numeroTelefone = numeroTelefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localCidade = localCidade;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalCidade() {
        return localCidade;
    }
}
