
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    private Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }
    @Test
    void testSumar() {
        double resultado = calculadora.sumar(5, 3);
        assertEquals(8.0, resultado, 0.0001, "La suma debe ser 8.0");
    }
    @Test
    void testRestar() {
        double resultado = calculadora.restar(10, 4);
        assertEquals(6.0, resultado, 0.0001, "La resta debe ser 6.0");
    }
    @Test
    void testMultiplicar() {
        double resultado = calculadora.multiplicar(2.5, 4);
        assertEquals(10.0, resultado, 0.0001, "La multiplicación debe ser 10.0");
    }
    @Test
    void testDividir() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado, 0.0001, "La división debe ser 5.0");
    }
    @Test
    void testDividirPorCeroDebeLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });
        assertEquals("No se puede dividir por cero.", exception.getMessage());
    }
}







