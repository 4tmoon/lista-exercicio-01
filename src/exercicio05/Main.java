package exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Distancia[] distancia = new Distancia[3];
        Random rd = new Random();

        for (int i = 0; i < distancia.length; i++) {
            distancia[i] = new Distancia(rd.nextDouble() * 100);
        }

        System.out.println("----------------------");
        for (Distancia d : distancia) {
            System.out.println("Distância em metros: " + d.distMetros());
            System.out.println("Distância em milhas: " + d.distMilhas());
            System.out.println("Distância em pés: " + d.distPes());
            System.out.println("----------------------");
        }
    }
}
