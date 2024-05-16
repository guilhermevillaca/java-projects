package br.com.guilhermevillaca;

/**
 *
 * @author villaca
 */
public class Triangulo extends Figura {

    private double lado;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double lado, double altura, String cor) {
        super(cor);
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.altura * this.lado;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + ", altura=" + altura + ", cor=" + super.getCor() + "}";
    }

}
