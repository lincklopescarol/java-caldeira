package exercicio02;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double base;

    public Retangulo(double largura, double base) {
       this.base = base;
       this.largura = largura;
    }

    @Override
    public double calcularArea() {
        System.out.println("A área do retângulo é: ");
        return this.largura * this.base;
    }
}
