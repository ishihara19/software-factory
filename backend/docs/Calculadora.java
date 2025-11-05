
/**
 * ------------------------------------------------------------------------------------
 * Empresa: TechSolutions S.A.S.
 * Proyecto: Utilidades Matemáticas
 * Autor: Laura Nathalia Salguero León
 * Fecha de creación: 5 de noviembre de 2025
 * Descripción: Esta clase proporciona operaciones matemáticas básicas como suma,
 *              resta, multiplicación y división entre números decimales.
 * ------------------------------------------------------------------------------------
 */

 /**
  * La clase {@code Calculadora} permite realizar operaciones aritméticas básicas
  * con números de tipo {@code double}. Incluye métodos para sumar, restar,
  * multiplicar y dividir, con manejo de excepciones para división por cero.
  *
  * <p>Ejemplo de uso:</p>
  * <pre>
  *     Calculadora calc = new Calculadora();
  *     double resultado = calc.sumar(4.5, 3.2);
  *     System.out.println("Resultado: " + resultado);
  * </pre>
  * 
  * @author Laura Nathalia Salguero León
  * @version 1.0
  * @since 2025-11-05
  */
public class Calculadora {

    /**
     * Suma dos números decimales.
     *
     * @param a el primer número a sumar.
     * @param b el segundo número a sumar.
     * @return la suma de {@code a} y {@code b}.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números decimales.
     *
     * @param a el minuendo.
     * @param b el sustraendo.
     * @return la resta de {@code a} menos {@code b}.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números decimales.
     *
     * @param a el primer número.
     * @param b el segundo número.
     * @return el producto de {@code a} y {@code b}.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números decimales.
     *
     * @param a el dividendo.
     * @param b el divisor.
     * @return el resultado de {@code a} dividido entre {@code b}.
     * @throws IllegalArgumentException si {@code b} es igual a cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }

    /**
     * Método principal para probar la funcionalidad de la clase {@code Calculadora}.
     *
     * @param args los argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(5.5, 2.3));
        System.out.println("Resta: " + calc.restar(5.5, 2.3));
        System.out.println("Multiplicación: " + calc.multiplicar(5.5, 2.3));
        System.out.println("División: " + calc.dividir(5.5, 2.3));
    }
}
