package EjerciciosActividad3.Ejercicio18Cap3;

import javax.swing.*;

public class MainEjercicio18 {
    public static void main(String[] args) {
        Interfaz1 interfaz = new Interfaz1();
        interfaz.setContentPane(interfaz.panelMain);
        interfaz.setSize(300, 400);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
