package EjerciciosActividad3.Ejercicio23Cap4;

public class EcuacionCuadratica {
    public double a;
    public double b;
    public double c;
    public double valor1;
    public double valor2;
    public double determinante;

    public double calcularDeterminante(double a, double b, double c){
        determinante = Math.sqrt(Math.pow(b, 2)-(4*a*c));
        return determinante;
    }


}
