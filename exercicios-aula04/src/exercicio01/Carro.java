package exercicio01;

public class Carro extends Veiculo {
    private double precoKm = 0.20;

    public Carro(String marca, String modelo, int ano) {
        // o super é usado pra chamar da classe pai
        super(marca, modelo, ano);
    }

    // override é pra dizer que tá reescrevendo um método, pra garantir que pegue as mesmas partes da classe original
    @Override
    public double calcularCustoViagem(int distancia) {
        System.out.println("O valor do custo da viagem de carro é de: ");
        return this.precoKm * distancia;
    }
}
