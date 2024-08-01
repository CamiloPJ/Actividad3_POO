package EjerciciosActividad3.Ejercicio19Cap3;

public class TrianguloEquilatero {
    double lado;

    TrianguloEquilatero(double lado){
        this.lado=lado;
    }

    double calculararea(){
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }

    double calcularperimetro(){
        return 3*lado;
    }
    double calcularaltura(){
        return (Math.sqrt(3)*(lado/2));
    }
}
