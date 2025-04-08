package exercicio08;

public class Equacao {
    private double a;
    private double b;
    private double c;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public String calcularRaizes() {
        String aux = "";
        double delta;
        double x1;
        double x2;

        delta = calcularDelta();
        if (delta < 0) {
            aux = "A equação não tem raíz real";
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            aux = String.format("x1: %.2f | x2: %.2f", x1, x2);
        }
        return aux;
    }
}
