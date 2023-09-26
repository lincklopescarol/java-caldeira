package exercicio01;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Ford", "Ka", 1990);
        Veiculo moto = new Moto("Honda", "Biz", 2010);

        // teste de calcular distância do carro
        System.out.println(carro.calcularCustoViagem(50));

        // teste de calcular a distância da moto
        System.out.println(moto.calcularCustoViagem(50));
    }
}
