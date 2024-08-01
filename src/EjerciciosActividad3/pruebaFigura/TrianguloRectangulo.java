package EjerciciosActividad3.pruebaFigura;

public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return ((base * altura) /  2.0);
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    /**
     * Método que determina si un triángulo es:
     * - Equilatero: si sus tres lados son iguales
     * - Escaleno: si sus tres lados son todos diferentes
     * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al
    método calcular hipotenusa */
    }
    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            return "Es un triangulo equilatero";
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            return "Es un triangulo escaleno";
        }
        else{
            return "Es un triangulo isosceles";
        }
    }
}
