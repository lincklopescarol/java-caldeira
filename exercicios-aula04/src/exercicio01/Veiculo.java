package exercicio01;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    protected Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String getMarca() {
        return this.marca;
    }

    private String getModelo() {
        return this.modelo;
    }

    private int getAno() {
        return this.ano;
    }

    protected abstract double calcularCustoViagem(int distancia);

    {

    }
}