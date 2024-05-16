package br.com.guilhermevillaca;

/**
 *
 * @author villaca
 */
public class Circulo extends Figura {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return this.raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + ", cor=" + super.getCor() +"}";
    }
    
    

}
