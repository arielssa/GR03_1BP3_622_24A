package ec.epn.edu;

public class Calculadora {

    public double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2){
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2){
        if(numero2 == 0){
            return 0;
        }
        return numero1 / numero2;
    }

}
