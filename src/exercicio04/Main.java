package exercicio04;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Temperatura[] temperatura = new Temperatura[3];
        Random rd = new Random();

        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = new Temperatura(rd.nextDouble() * 100);
        }

        System.out.println("----------------------");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Celsius: " + temperatura[i].tempCelsius());
            System.out.println("Fahrenheit: " + temperatura[i].tempFahrenheit());
            System.out.println("Kelvin: " + temperatura[i].tempKelvin());
            System.out.println("----------------------");
        }
    }
}
