package EjerciciosActividad3.Ejercicio7Cap4;

import javax.swing.*;

public class MainEjercicio7 {
    public static void main(String[] args) {
        Interfaz3 interfaz = new Interfaz3();
        interfaz.setContentPane(interfaz.panel3);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
