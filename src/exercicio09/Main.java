package exercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int qnt;
        System.out.print("Informe o número de elementos: ");
        qnt = x.nextInt();

        Circulo[] circulos = new Circulo[qnt];
        double raio;

        for (int i = 0; i < qnt; i++) {
            System.out.println("Círculo " + (i + 1) + ": ");
            System.out.print("Raio: ");
            raio = x.nextDouble();
            circulos[i] = new Circulo(raio);
            System.out.println("----------------------");
        }

        for (int i = 0; i < qnt; i++) {
            System.out.println("Círculo " + (i + 1) + ": ");
            System.out.println("Área: " + circulos[i].calcularArea());
            System.out.println("Perímetro: " + circulos[i].calcularPerimetro());
            System.out.println("----------------------");
        }
    }
}
