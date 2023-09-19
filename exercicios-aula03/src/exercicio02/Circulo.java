package exercicio02;

public class Circulo {
    public double raio = 3;

    public void calcularArea() {
        double area = 3.14 * (this.raio * this.raio);
        System.out.println(area);
    }

    public void calcularCircunferencia() {
        double circunferencia = 2 * 3.14 * (this.raio);
        System.out.println(circunferencia);
    }

}
