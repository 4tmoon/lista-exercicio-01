package exercicio05;

public class Distancia {
    private double distancia;

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    public double distMetros() {
        return distancia;
    }

    public double distMilhas() {
        return distancia * 0.000621371;
    }

    public double distPes() {
        return distancia * 3.28084;
    }
}
