package EjerciciosActividad3.pruebaFigura;

import EjerciciosActividad3.Ejercicio40Cap5.Interfaz40;

import javax.swing.*;
import java.util.Scanner;

public class MainPruebaFigura {
    public static void main(String[] args) {
        InterfazPruebaFigura interfazPruebaFigura = new InterfazPruebaFigura();
        interfazPruebaFigura.setContentPane(interfazPruebaFigura.panelPruebaFigura);
        interfazPruebaFigura.setSize(300, 400);
        interfazPruebaFigura.setVisible(true);
        interfazPruebaFigura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
