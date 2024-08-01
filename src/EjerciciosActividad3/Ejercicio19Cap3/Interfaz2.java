package EjerciciosActividad3.Ejercicio19Cap3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz2 extends JFrame {
    private JTextField txtLado;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblPerimetro;
    private JLabel lblAltura;
    private JLabel lblArea;
    public JPanel panel2;

    public Interfaz2() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(txtLado.getText());

                TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(lado);
                lblPerimetro.setText(String.format("%.2f", trianguloEquilatero.calcularperimetro()));
                lblAltura.setText(String.format("%.2f", trianguloEquilatero.calcularaltura()));
                lblArea.setText(String.format("%.2f", trianguloEquilatero.calculararea()));
            }
        });
        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");
            }
        });
    }
}
