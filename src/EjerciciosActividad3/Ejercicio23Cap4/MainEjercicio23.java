package EjerciciosActividad3.Ejercicio23Cap4;

import EjerciciosActividad3.Ejercicio22Cap4.Interfaz5;

import javax.swing.*;
import java.util.Scanner;

public class MainEjercicio23 {
    public static void main(String[] args) {
        Interfaz23 interfaz = new Interfaz23();
        interfaz.setContentPane(interfaz.panel23);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
