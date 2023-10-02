public class Main {
    public static void main(String[] args){
        ContaBancaria contaDaMaria = new ContaBancaria("Maria", "9098765432", 300.00);

        // teste de saque
        contaDaMaria.sacar(200);
        System.out.println(contaDaMaria.getNome() + ", possui o saldo de: "+ contaDaMaria.getSaldo() + " reais.");
    }
}