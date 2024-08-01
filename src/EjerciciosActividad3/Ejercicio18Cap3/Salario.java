package EjerciciosActividad3.Ejercicio18Cap3;

import java.util.Scanner;

public class Salario {
    public Double salarioBruto;
    public Double salarioNeto;
    public Double retencion;
    public Salario(Double salarioHora, Double horasTrabajadas, Double pctjRetencion){
        salarioBruto = horasTrabajadas * salarioHora;
        retencion = salarioBruto*(pctjRetencion/100);
        salarioNeto = salarioBruto-retencion;
    }
}
