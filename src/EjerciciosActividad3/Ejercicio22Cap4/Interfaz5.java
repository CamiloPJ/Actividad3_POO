package EjerciciosActividad3.Ejercicio22Cap4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Interfaz5 extends JFrame{
    private JTextField txtNombreEmpleado;
    private JTextField txtSalarioHora;
    private JTextField txtHorasTrabajadas;
    private JButton btnBorrar;
    private JButton btnResultado;
    private JLabel lblSalarioMensual;
    private JLabel lblNombreEmpleado;
    public JPanel panel5;

    public Interfaz5() {
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreEmpleado = txtNombreEmpleado.getText();
                double salarioHora = Double.parseDouble(txtSalarioHora.getText());
                double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());

                Empleado empleado = new Empleado(nombreEmpleado,salarioHora,horasTrabajadas);
                if (empleado.calcularSalarioMensual() > 450000) {
                    lblNombreEmpleado.setText(String.format(empleado.nombre_empleado));
                    lblSalarioMensual.setText(String.format(String.valueOf(empleado.salario_mensual)));
                } else {
                    lblNombreEmpleado.setText(String.format(empleado.nombre_empleado));
                    lblSalarioMensual.setText(String.format("El empleado gana menos de $450.000"));
                }
            }
        });

        // Acción al presionar el botón de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombreEmpleado.setText("");
                txtHorasTrabajadas.setText("");
                txtSalarioHora.setText("");
                lblSalarioMensual.setText("");
                lblNombreEmpleado.setText("");
            }
        });
    }

}
