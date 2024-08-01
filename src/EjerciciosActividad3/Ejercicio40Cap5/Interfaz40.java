package EjerciciosActividad3.Ejercicio40Cap5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz40 extends JFrame {
    private JTextField txtNumero;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblSqrt;
    private JLabel lblCube;
    public JPanel panel40;

    public Interfaz40() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(txtNumero.getText());
                double sqrt = Math.sqrt(numero);
                double cube = Math.cbrt(numero);

                lblSqrt.setText(String.format(String.valueOf(sqrt)));
                lblCube.setText(String.format(String.valueOf(cube)));
            }
        });
        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
                lblCube.setText("");
                lblSqrt.setText("");
            }
        });
    }
}
