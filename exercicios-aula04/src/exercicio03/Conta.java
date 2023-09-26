package exercicio03;

public class Conta {
    protected double saldo;

    public double sacar(double valor) {
        if (valor <= saldo) {
            this.saldo = saldo - valor;
        }
        return this.saldo;
    }

    public double depositar(double valor) {
        this.saldo = saldo + valor;
        return this.saldo;
    }

    public double obterSaldo() {
        return this.saldo;
    }
}
