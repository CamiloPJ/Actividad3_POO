package EjerciciosActividad3.Ejercicio18Cap3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz1 extends JFrame {
    private JTextField txtCodigoEmpleado;
    private JTextField txtNombreEmpleado;
    private JTextField txtHorasTrabajadas;
    private JTextField txtSalarioHora;
    private JTextField txtPctjRetencion;
    private JButton btnResultado;
    private JButton btnBorrar;
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JLabel lblSalarioNeto;
    private JLabel lblSalarioBruto;
    public JPanel panelMain;



    public Interfaz1() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int codigoEmpleado = Integer.parseInt(txtCodigoEmpleado.getText());
                String nombreEmpleado = txtNombreEmpleado.getText();
                double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
                double salarioHora = Double.parseDouble(txtSalarioHora.getText());
                double pctjRetencion = Double.parseDouble(txtPctjRetencion.getText());

                Salario salario = new Salario(salarioHora, horasTrabajadas, pctjRetencion);
                lblSalarioNeto.setText(String.format("%.2f", salario.salarioNeto));
                lblSalarioBruto.setText(String.format("%.2f", salario.salarioBruto));

                Empleado empleado = new Empleado(codigoEmpleado, nombreEmpleado);
                lblCodigo.setText(String.valueOf(empleado.codigoEmpleado));
                lblNombre.setText(empleado.nombreEmpleado);

            }

        });
        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigoEmpleado.setText("");
                txtNombreEmpleado.setText("");
                txtHorasTrabajadas.setText("");
                txtSalarioHora.setText("");
                txtPctjRetencion.setText("");
            }
        });
    }
}
