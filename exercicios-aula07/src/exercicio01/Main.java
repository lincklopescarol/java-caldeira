public class Main {
    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel quadrado = new Quadrado();

        System.out.println(circulo.desenhar());
        System.out.println(quadrado.desenhar());
    }
}
