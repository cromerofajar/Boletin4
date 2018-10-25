package boletin4;

public class Circulo {

    private double radio;
    private final double pi = 3.14;
    private double area;
    private double longitud;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        area = Math.pow(radio, radio);
        return area;
    }

    public double calcularLongitud() {
        longitud = 2 * pi * radio;
        return longitud;
    }

    public double setRadio() {
        return radio;
    }
}
