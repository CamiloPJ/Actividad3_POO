package EjerciciosActividad3.Ejercicio10Cap4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz4 extends JFrame {
    private JTextField txtNumeroInscripcion;
    private JTextField txtNombres;
    private JTextField txtPatrimonio;
    private JTextField txtEstrato;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblNumeroInscripcion;
    private JLabel lblNombres;
    private JLabel lblPago;
    public JPanel panel4;

    public Interfaz4() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroInscripcion = Integer.parseInt(txtNumeroInscripcion.getText());
                String nombre = txtNombres.getText();
                double patrimonio = Double.parseDouble(txtPatrimonio.getText());
                int estratoSocial = Integer.parseInt(txtEstrato.getText());
                double pagoMatricula = 50000;

                if (patrimonio>2000000 && estratoSocial>3){
                    pagoMatricula = pagoMatricula + (0.03*patrimonio);
                }

                Estudiante estudiante = new Estudiante(numeroInscripcion, nombre, patrimonio, estratoSocial);

                lblNumeroInscripcion.setText(String.format(String.valueOf(estudiante.numeroDeInscripcion)));
                lblNombres.setText(String.format(estudiante.nombres));
                lblPago.setText(String.format(String.valueOf(pagoMatricula)));
            }
        });

        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtEstrato.setText("");
                txtPatrimonio.setText("");
                txtNombres.setText("");
                txtNumeroInscripcion.setText("");
                lblNombres.setText("");
                lblNumeroInscripcion.setText("");
                lblPago.setText("");
            }
        });
    }
}
