package exercicio01;

import java.text.DecimalFormat;

public class Bicicleta {
    private String cor;
    private int numMarchas;
    private double valor;

    public Bicicleta(String cor, int numMarchas, double valor) {
        this.cor = cor;
        this.numMarchas = numMarchas;
        this.valor = valor;
    }

    public String imprimirDados() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        aux += "Cor: " + cor + "\n";
        aux += "Número de marchas: " + numMarchas + "\n";
        aux += "Valor: " + df.format(valor) + "\n";
        return aux;
    }
}
