package exercicio02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formasGeometricas = new ArrayList<FormaGeometrica>();

        FormaGeometrica retangulo = new Retangulo(10, 10);
        formasGeometricas.add(retangulo);

        FormaGeometrica circulo = new Circulo(10, 3.14);
        formasGeometricas.add(circulo);

        FormaGeometrica triangulo = new Triangulo(30, 5);
        formasGeometricas.add(triangulo);

        FormaGeometrica quadrado = new Quadrado(10, 10);
        formasGeometricas.add(quadrado);

        FormaGeometrica losango = new Losango(30, 20);
        formasGeometricas.add(losango);

        for(int i = 0; i< formasGeometricas.size(); i++){
            FormaGeometrica forma = formasGeometricas.get(i);
            double area = forma.calcularArea();
            System.out.println(area);
        }
    }
}
