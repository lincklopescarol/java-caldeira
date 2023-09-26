package exercicio02;

public class Circulo extends FormaGeometrica {
    private double raio;
    private double pi;

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public double calcularArea() {
        System.out.println("A área do círculo é: ");
        return (this.raio * this.raio) * this.pi;
    }
}
