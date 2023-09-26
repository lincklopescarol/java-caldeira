package exercicio03;

public class ContaPoupanca extends Conta implements Tributavel {
    public ContaPoupanca(double valor) {
        this.saldo = valor;
    }

    public ContaPoupanca() {
    }

    @Override
    public double calculaTributos() {
        return 0;
    }
}
