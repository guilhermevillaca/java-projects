package br.com.guilhermevillaca;

/**
 *
 * @author villaca
 */
public abstract class Figura {

    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
    }

    public abstract double area();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura{" + "cor=" + cor + '}';
    }

}
