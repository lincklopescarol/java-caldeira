package exercicio02;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected double calcularArea() {
        System.out.println("A área do triângulo é: ");
        return (this.base * this.altura)/2;
    }
}
