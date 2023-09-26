package exercicio01;

public class Moto extends Veiculo{
    private double precoKm = 0.15;

    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    protected double calcularCustoViagem(int distancia) {
        System.out.println("O valor do custo da viagem de moto é de: ");
        return this.precoKm * distancia;
    }
}
