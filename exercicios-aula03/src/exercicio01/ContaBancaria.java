import java.time.LocalTime;
import java.util.Date;

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
        // pra exibir a hora
        int hora = horarioAtual.getHour();
        int minuto = horarioAtual.getMinute();
        System.out.println(hora + ":" + minuto);

        if (saldo > valor) {
            this.saldo = saldo - valor;
        } else {
            System.out.println("Erro!");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        int hora = horarioAtual.getHour();

        if ((hora >= 8) && (hora <= 19)) {
            this.saldo = saldo - valor;
            destino.saldo += valor;
        } else {
            System.out.println("Erro!");
        }
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
