package exercicio07;

public class Bola {
    private String cor;
    private double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola(Bola b1, Bola b2) {
        Bola aux = null;

        if (this.raio > b1.raio && this.raio > b2.raio) {
            aux = this;
        } else if (b1.raio > b2.raio) {
            aux = b1;
        } else {
            aux = b2;
        }
        return aux;
    }

    public String retornarDados() {
        return cor + " " + raio;
    }


}
