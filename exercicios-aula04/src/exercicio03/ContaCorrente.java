package exercicio03;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double valor) {
        this.saldo = valor;
    }

    public ContaCorrente() {
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.1;
    }

    public double seguroDeVida() {
        return this.saldo - 42.00;
    }
}
