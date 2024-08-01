package EjerciciosActividad3.Ejercicio7Cap4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz3 extends JFrame {
    private JTextField txtA;
    private JTextField txtB;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblResultado;
    public JPanel panel3;

    public Interfaz3() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numeroA = Double.parseDouble(txtA.getText());
                double numeroB = Double.parseDouble(txtB.getText());
                if (numeroA > numeroB) {
                    lblResultado.setText(String.format("A es mayor que B"));
                } else if (numeroA == numeroB) {
                    System.out.println("HOLAAAA");
                    lblResultado.setText(String.format("A es igual a B"));
                } else if (numeroA < numeroB) {
                    lblResultado.setText(String.format("A es menor que B"));
                }
            }
        });

        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                lblResultado.setText("");

            }
        });
    }
}
