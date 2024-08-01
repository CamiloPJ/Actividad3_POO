package EjerciciosActividad3.Ejercicio40Cap5;

import EjerciciosActividad3.Ejercicio10Cap4.Interfaz4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEjercicio40 {
    public static void main(String[] args) {
        Interfaz40 interfaz = new Interfaz40();
        interfaz.setContentPane(interfaz.panel40);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
