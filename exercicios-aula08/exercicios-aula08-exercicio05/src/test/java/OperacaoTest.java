import org.example.Operacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacaoTest {

    @Test
    public void somarNumeros() {
        Operacao operacao = new Operacao();
        int[] numeros = {1, 2};
        int soma = 3;
        int resultado = operacao.somarNumeros(numeros);
        assertEquals(soma, resultado);
    }

    @Test
    public void ehPar() {
        Operacao operacao = new Operacao();
        assertTrue(operacao.ehPar(2));
        assertFalse(operacao.ehPar(3));
    }

    @Test
    public void calcularFatorial() {
        Operacao operacao = new Operacao();
        assertEquals(1, operacao.calcularFatorial(1));
        assertEquals(2, operacao.calcularFatorial(2));
        assertEquals(6, operacao.calcularFatorial(3));
        // teste para uma entrada negativa
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFatorial(-1));
    }

    @Test
    public void ehPalindromo() {
        Operacao operacao = new Operacao();
        assertTrue(operacao.ehPalindromo("arara"));
        assertFalse(operacao.ehPalindromo("oi"));
    }

    @Test
    public void calcularFibonacci() {
        Operacao operacao = new Operacao();
        assertEquals(1, operacao.calcularFibonacci(1));
        assertEquals(1, operacao.calcularFibonacci(2));
        assertEquals(2, operacao.calcularFibonacci(3));
        assertEquals(3, operacao.calcularFibonacci(4));
        assertEquals(5, operacao.calcularFibonacci(5));
        assertEquals(8, operacao.calcularFibonacci(6));
        assertEquals(13, operacao.calcularFibonacci(7));
        // teste para uma entrada negativa
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFibonacci(-1));
    }
}
