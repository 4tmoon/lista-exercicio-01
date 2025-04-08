package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int qnt;

        System.out.print("Insira o número de bicicletas para cadastro: ");
        qnt = x.nextInt();

        String cor;
        int qntMarchas;
        double valor;

        Bicicleta[] bicicletas = new Bicicleta[qnt];
        for (int i = 0; i < qnt; i++) {
            x.nextLine();

            System.out.println("Bicicleta " + (i + 1) + ": ");
            System.out.print("Cor: ");
            cor = x.nextLine();
            System.out.print("Número de marchas: ");
            qntMarchas = x.nextInt();
            System.out.print("Valor: ");
            valor = x.nextDouble();
            bicicletas[i] = new Bicicleta(cor, qntMarchas, valor);
        }

        System.out.println("----------------------");
        for (int i = 0; i < qnt; i++) {
            System.out.println(bicicletas[i].imprimirDados());
        }
    }
}
