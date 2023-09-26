package exercicio04;

public class Compra {
    private String produto;
    private String dataValidade;
    double valor;

    public Compra(String produto, String dataValidade, double valor) {
        this.produto = produto;
        this.dataValidade = dataValidade;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public double getValor() {
        return valor;
    }

}

