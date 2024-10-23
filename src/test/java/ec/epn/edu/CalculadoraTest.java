package ec.epn.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        double resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        double resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, 0.001);
    }

    @Test
    public void testMultiplicar() {
        double resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado, 0.001);
    }

    @Test
    public void testDividir() {
        double resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado, 0.001);
    }

    @Test
    public void testDividirPorCero() {
        double resultado = calculadora.dividir(6, 0);
        assertEquals(0, resultado, 0.001);
    }
}