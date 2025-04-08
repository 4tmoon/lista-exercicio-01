package exercicio04;

public class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String tempCelsius() {
        return String.format("%.2f", temperatura);
    }

    public String tempFahrenheit() {
        return String.format("%.2f", temperatura * 9 / 5 + 32);
    }

    public String tempKelvin() {
        return String.format("%.2f", temperatura + 273);
    }
}
