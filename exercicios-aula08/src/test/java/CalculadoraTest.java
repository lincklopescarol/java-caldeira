import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void somarNumeros() {
        Calculadora calculadora = new Calculadora();

        double somar = calculadora.somarNumeros(10, 10);
        Assertions.assertEquals(20, somar);
    }

    @Test
    void subtrairNumeros() {
        Calculadora calculadora = new Calculadora();

        double subtrair = calculadora.subtrairNumeros(10, 5);
        Assertions.assertEquals(subtrair, 5);
    }

    @Test
    void multiplicarNumeros(){
        Calculadora calculadora = new Calculadora();

        double multiplicar = calculadora.multiplicarNumeros(5, 2);
        Assertions.assertEquals(multiplicar, 10);
    }
    @Test
    void dividirNumeros(){
        Calculadora calculadora = new Calculadora();

        double dividir = calculadora.dividirNumeros(10, 2);
        Assertions.assertEquals(dividir, 5);
    }
    @Test
    void raizQuadradaDosNumeros(){
        Calculadora calculadora = new Calculadora();

        double raizQuadrada = calculadora.raizQuadradaDosNumeros(9);
        Assertions.assertEquals(raizQuadrada, 3);
    }
    @Test
    void potenciaDosNumeros(){
        Calculadora calculadora = new Calculadora();

        double potencia = calculadora.potenciaDosNumeros(3);
        Assertions.assertEquals(potencia, 9);
    }
}
