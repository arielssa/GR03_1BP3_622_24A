package ec.epn.edu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculadoraTestConParametros {

    private final double numero1;
    private final double numero2;
    private final double esperadoSuma;
    private final double esperadoResta;

    private Calculadora calculadora = new Calculadora();

    // Constructor que recibe los parámetros de prueba
    public CalculadoraTestConParametros(double numero1, double numero2, double esperadoSuma, double esperadoResta) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.esperadoSuma = esperadoSuma;
        this.esperadoResta = esperadoResta;
    }

    // Define los valores de prueba para los parámetros
    @Parameterized.Parameters
    public static Collection<Object[]> parametros() {
        return Arrays.asList(new Object[][] {
                { 10, 5, 15, 5 },
                { 20, 10, 30, 10 },
                { -5, -3, -8, -2 },
                { 0, 0, 0, 0 }
        });
    }

    // Prueba parametrizada para la suma
    @Test
    public void testSumar() {
        assertEquals(esperadoSuma, calculadora.sumar(numero1, numero2), 0.001);
    }

    // Prueba parametrizada para la resta
    @Test
    public void testRestar() {
        assertEquals(esperadoResta, calculadora.restar(numero1, numero2), 0.001);
    }
}
