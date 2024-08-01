package EjerciciosActividad3.Ejercicio41Cap5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interfaz41 extends JFrame{
    public JPanel panel41;
    private JTextField txtA;
    private JButton btnBorrar;
    private JButton btnResultado;
    private JLabel lblResultado;
    private JTextField txtB;
    private JTextField txtC;
    private JTextField txtD;

    public Interfaz41() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Double> listaNumero = new ArrayList<>();
                double A = Double.parseDouble(txtA.getText());
                listaNumero.add(A);
                double B = Double.parseDouble(txtB.getText());
                listaNumero.add(B);
                double C = Double.parseDouble(txtC.getText());
                listaNumero.add(C);
                double D = Double.parseDouble(txtD.getText());
                listaNumero.add(D);

                double mayor = Collections.max(listaNumero);

                lblResultado.setText(String.format("El mayor número entre " + listaNumero + " es:  " + mayor));


            }
        });
        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                txtD.setText("");
                lblResultado.setText("");
            }
        });
    }
}
