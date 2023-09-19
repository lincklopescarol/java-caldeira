package exercicio01;
import java.time.LocalTime;

public class ContaBancaria {
    public String nome = "Carol";
    public String CPF = "1122334455";
    private String identificadorConta = "123ABC";
    private String endereco = "Porto Alegre";
    private String banco = "Agi";
    public double saldo = 100;
    public LocalTime horarioAtual = LocalTime.now();

    public void saque(double valor) {
        this.saldo = saldo - valor;
    }

    public void deposito(double valor) {
        this.saldo = saldo + valor;
    }

    public void pix(double valor) {
        if (saldo > valor) {
            this.saldo = saldo - valor;
        } else {
            System.out.println("Erro!");
        }
    }
    // arrumar a transferencia pra yours
    public void transferencia(ContaBancaria destino, ContaBancaria origem, double valor) {
        this.saldo = saldo - valor;
    }
    // arrumar essa aqui
    public void verificarsaldo() {
        this.saldo = saldo - 0;
    }
    public void verificarHorario() {
        this.horarioAtual = horarioAtual;
    }

    public void verificarInformacoes() {
        this.nome = nome;
        this.CPF = CPF;
        this.saldo = saldo;
        this.endereco = endereco;
        this.banco = banco;
        this.identificadorConta = identificadorConta;
    }

}