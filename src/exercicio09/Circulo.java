package exercicio09;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String calcularArea() {
        return String.format("%.2f", Math.PI * Math.pow(raio, 2));

    }

    public String calcularPerimetro() {
        return String.format("%.2f", 2 * Math.PI * raio);
    }
}
