public class ContaBancaria {
    private String nome;
    private String CPF;
    private double saldo;

    public ContaBancaria(String nome, String CPF, double saldo) {
        this.nome = nome;
        this.CPF = CPF;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double valor) {
        try {
            if (valor >= this.saldo) {
                throw new Exception("Saldo insuficiente para realizar o saque!");
            } else {
                this.saldo = saldo - valor;
                return this.saldo;
            }
        } catch (Exception exception) {
            System.err.println("Erro: " + exception.getMessage());
            return 0;
        }
    }
}
