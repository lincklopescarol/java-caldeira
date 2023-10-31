import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void calcularPagamentoHipoteca() {
        Calculadora calculadora = new Calculadora();
        double valorEmprestimo = 60000;
        double taxaJurosAnual = 4.0;
        int prazoEmAnos = 15;

        double pagamentoMensalEsperado = 443.81;

        double calculo = calculadora.calcularPagamentoHipoteca(
                valorEmprestimo, taxaJurosAnual, prazoEmAnos);

        // delta para arredondar o resultado
        assertEquals(pagamentoMensalEsperado, calculo, 0.01);
    }
}
