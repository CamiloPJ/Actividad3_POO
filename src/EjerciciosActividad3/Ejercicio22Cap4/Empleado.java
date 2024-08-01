package EjerciciosActividad3.Ejercicio22Cap4;

public class Empleado {
    public String nombre_empleado;
    public double salario_hora;
    public double horas_trabajadas;
    public double salario_mensual;

    public Empleado(String nombre_empleado, double salario_hora, double horas_trabajadas) {
        this.nombre_empleado = nombre_empleado;
        this.salario_hora = salario_hora;
        this.horas_trabajadas = horas_trabajadas;
    }

    public double calcularSalarioMensual(){
        salario_mensual=horas_trabajadas*salario_hora;
        return salario_mensual;
    }

}
