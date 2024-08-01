package EjerciciosActividad3.Ejercicio10Cap4;

import javax.swing.*;

public class MainEjercicio10 {
    public static void main(String[] args) {
        Interfaz4 interfaz = new Interfaz4();
        interfaz.setContentPane(interfaz.panel4);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
