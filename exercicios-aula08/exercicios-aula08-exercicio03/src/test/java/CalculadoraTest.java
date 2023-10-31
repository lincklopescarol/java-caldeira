import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void somar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somarNumeros(1.0, 3.0);
        assertEquals(4.0, resultado);
    }

    @Test
    public void subtrair() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrairNumeros(5.0, 4.0);
        assertEquals(1.0, resultado);
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicarNumeros(5.0, 2.0);
        assertEquals(10.0, resultado);
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividirNumeros(4.0, 2.0);
        assertEquals(2.0, resultado);
    }

    @Test
    public void raizQuadrada() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.raizQuadradaDosNumeros(16);
        assertEquals(4.0, resultado);
    }

    @Test
    public void potencia() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.potenciaDosNumeros(4);
        assertEquals(16.0, resultado);
    }
}
