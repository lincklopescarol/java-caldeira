package exercicio03;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        // depositando saldos nas contas
        contaCorrente.depositar(100);
        contaPoupanca.depositar(100);

        // verificando saldo nas contas
//        System.out.println(contaCorrente.obterSaldo());
//        System.out.println(contaPoupanca.obterSaldo());
//
//        // calculando tributos nas contas
//        System.out.println(contaCorrente.calculaTributos());
//        System.out.println(contaPoupanca.calculaTributos());
//
//        // sacando nas contas
//        System.out.println(contaCorrente.sacar(30));
//        System.out.println(contaPoupanca.sacar(50));
//
//        // conta corrente com seguro de vida
//        System.out.println(contaCorrente.seguroDeVida());

        // testando o gerenciador de imposto de renda

    }
}
