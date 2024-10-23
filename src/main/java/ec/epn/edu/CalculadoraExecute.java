package ec.epn.edu;

public class CalculadoraExecute {

    public static void main(String[] args) {

        System.out.println("==== Calculadora Execute ====");

        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(3,9);
        System.out.println("calculadora.sumar(3,9) = " + suma);

        double resta = calculadora.restar(36,3);
        System.out.println("calculadora.restar(36,3) = " + resta);





    }


}
