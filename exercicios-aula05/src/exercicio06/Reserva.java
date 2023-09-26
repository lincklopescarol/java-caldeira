package exercicio06;

public class Reserva {
    private String nome;
    private String local;
    private String CPF;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String local, String CPF, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.CPF = CPF;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }
}
