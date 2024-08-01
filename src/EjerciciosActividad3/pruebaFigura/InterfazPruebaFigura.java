package EjerciciosActividad3.pruebaFigura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPruebaFigura extends JFrame {
    private JTextField txtCRadio;
    private JButton btnCResultado;
    private JButton btnCBorrar;
    private JLabel lblCArea;
    private JLabel lblCperimetro;
    private JTextField txtTAltura;
    private JTextField txtTBase;
    private JButton btnTResultado;
    private JButton btnTBorrar;
    private JLabel lblTArea;
    private JLabel lblTHipotenusa;
    private JLabel lblTPerimetro;
    private JLabel lblTTipo;
    private JTextField txtQLado;
    private JButton btnQBorrar;
    private JButton btnQResultado;
    private JLabel lblQArea;
    private JLabel lblQPerimetro;
    private JTextField txtRAltura;
    private JTextField txtRBase;
    private JButton btnRResultado;
    private JButton btnRBorrar;
    private JLabel lblRArea;
    private JLabel lblRPerimetro;
    public JPanel panelPruebaFigura;

    public InterfazPruebaFigura() {
        btnCResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int radio = Integer.parseInt(txtCRadio.getText());
                Circulo circulo = new Circulo(radio);
                double areaC = circulo.calcularArea();
                double perimetroC = circulo.calcularPerimetro();
                lblCArea.setText(String.format(String.valueOf(areaC)));
                lblCperimetro.setText(String.format(String.valueOf(perimetroC)));
            }
        });
        // Acción al presionar el botón de borrar
        btnCBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCRadio.setText("");
                lblCperimetro.setText("");
                lblCArea.setText("");
            }
        });


        btnTResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int altura = Integer.parseInt(txtTAltura.getText());
                int base = Integer.parseInt(txtTBase.getText());
                TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base,altura);
                double areaT = trianguloRectangulo.calcularArea();
                double perimetroT = trianguloRectangulo.calcularPerimetro();
                double hipotenusaT = trianguloRectangulo.calcularHipotenusa();
                String tipoDeT = trianguloRectangulo.determinarTipoTriangulo();
                lblTArea.setText(String.format(String.valueOf(areaT)));
                lblTPerimetro.setText(String.format(String.valueOf(perimetroT)));
                lblTHipotenusa.setText(String.format(String.valueOf(hipotenusaT)));
                lblTTipo.setText(String.format(tipoDeT));
            }
        });
        // Acción al presionar el botón de borrar
        btnTBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTBase.setText("");
                txtTAltura.setText("");
                lblTTipo.setText("");
                lblTHipotenusa.setText("");
                lblTPerimetro.setText("");
                lblTArea.setText("");
            }
        });


        btnQResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lado = Integer.parseInt(txtQLado.getText());
                Cuadrado cuadrado = new Cuadrado(lado);
                double areaQ = cuadrado.calcularArea();
                double perimetroQ = cuadrado.calcularPerimetro();
                lblQArea.setText(String.format(String.valueOf(areaQ)));
                lblQPerimetro.setText(String.format(String.valueOf(perimetroQ)));
            }
        });

        // Acción al presionar el botón de borrar
        btnQBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtQLado.setText("");
                lblQPerimetro.setText("");
                lblQArea.setText("");
            }
        });


        btnRResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int altura = Integer.parseInt(txtRAltura.getText());
                int base = Integer.parseInt(txtRBase.getText());
                Rectangulo rectangulo = new Rectangulo(base, altura);
                double areaR = rectangulo.calcularArea();
                double perimetroR = rectangulo.calcularPerimetro();
                lblRPerimetro.setText(String.format(String.valueOf(perimetroR)));
                lblRArea.setText(String.format(String.valueOf(areaR)));
            }
        });

        // Acción al presionar el botón de borrar
        btnRBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRBase.setText("");
                txtRAltura.setText("");
                lblRArea.setText("");
                lblRPerimetro.setText("");
            }
        });
    }
}
