package exercicio02;

public class Losango extends FormaGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    protected double calcularArea() {
        System.out.println("A área do losango é: ");
        return (this.diagonalMaior * diagonalMenor) / 2;
    }
}
