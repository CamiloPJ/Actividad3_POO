package EjerciciosActividad3.Ejercicio23Cap4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz23 extends JFrame{
    private JTextField txtC;
    private JTextField txtB;
    private JTextField txtA;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblResultado;
    public JPanel panel23;

    public Interfaz23() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double coeficienteA = Double.parseDouble(txtA.getText());
                double coeficienteB = Double.parseDouble(txtB.getText());
                double coeficienteC = Double.parseDouble(txtC.getText());
                double valor1;
                double valor2;

                EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica();
                double determinante = ecuacionCuadratica.calcularDeterminante(coeficienteA,coeficienteB,coeficienteC);

                if (determinante > 0) {
                    valor1= (-coeficienteB + determinante)/(2*coeficienteA);
                    valor2= (-coeficienteB - determinante)/(2*coeficienteA);
                    lblResultado.setText(String.format("Las poisbles soluciones son:  x1 = " + valor1 + " y x2 = " + valor2));;
                }

                else{
                    lblResultado.setText(String.format("La ecuacion de segundo grado no tiene soluciones reales"));
                }
            }
        });
        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                lblResultado.setText("");
            }
        });

    }
}
