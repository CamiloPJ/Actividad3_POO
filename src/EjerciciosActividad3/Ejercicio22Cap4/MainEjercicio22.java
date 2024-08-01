package EjerciciosActividad3.Ejercicio22Cap4;

import EjerciciosActividad3.Ejercicio10Cap4.Interfaz4;

import javax.swing.*;
import java.util.Scanner;

public class MainEjercicio22 {
    public static void main(String[] args) {
        Interfaz5 interfaz = new Interfaz5();
        interfaz.setContentPane(interfaz.panel5);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
