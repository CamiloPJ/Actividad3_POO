package EjerciciosActividad3.Ejercicio19Cap3;

import javax.swing.*;

public class MainEjercicio19 {
    public static void main(String[] args) {
        Interfaz2 interfaz = new Interfaz2();
        interfaz.setContentPane(interfaz.panel2);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
