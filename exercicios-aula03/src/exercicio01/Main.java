public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        ContaBancaria yours = new ContaBancaria();

        // teste de saque
//        conta.saque(20);
//        System.out.println(conta.saldo);

        // teste de verificar saldo
//        conta.verificarsaldo();
//        System.out.println(conta.saldo);

        //teste de ver a hora
//        conta.verificarHorario();
//        System.out.println(conta.horarioAtual);

        // teste de ver o pix
//        conta.pix(300);
//        System.out.println(conta.saldo);

        conta.transferencia(yours, conta, 40);
        System.out.println(conta.saldo);
        System.out.println(yours.saldo);
    }
}
