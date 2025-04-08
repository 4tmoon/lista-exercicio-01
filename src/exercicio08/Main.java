package exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int qnt;
        System.out.print("Quantidade de equações: ");
        qnt = x.nextInt();

        Equacao[] equacao = new Equacao[qnt];
        double a, b, c;

        for (int i = 0; i < qnt; ) {
            System.out.println((i+1) + "° equação: ");

            System.out.print("Valor de a: ");
            a = x.nextDouble();
            if (a == 0) {
                System.out.println("Não é uma equação de 2° grau");
            } else {
                System.out.print("Valor de b: ");
                b = x.nextDouble();
                System.out.print("Valor de c: ");
                c = x.nextDouble();
                equacao[i] = new Equacao(a, b, c);
                i++;
            }
            System.out.println("----------------------");
        }

        for (int i = 0; i < qnt; i++) {
            System.out.println((i+1) + "° equação: ");
            System.out.println(equacao[i].calcularRaizes());
            System.out.println("----------------------");
        }

    }
}
