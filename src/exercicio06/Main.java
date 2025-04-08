package exercicio06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(3, 30, 0);
        Hora h2 = new Hora(23, 45, 02);
        Hora h3 = new Hora(48, 125, 963);

        System.out.println(h1.validar());
        System.out.println(h2.validar());
        System.out.println(h3.validar());
    }
}