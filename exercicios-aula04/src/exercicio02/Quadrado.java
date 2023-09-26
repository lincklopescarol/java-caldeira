package exercicio02;

public class Quadrado extends FormaGeometrica {
    private double base;
    private double altura;

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected double calcularArea() {
        System.out.println("A área do quadrado é: ");
        return this.altura * this.base;
    }
}
