package br.com.guilhermevillaca;

/**
 *
 * @author villaca
 */
public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }
    
    public Quadrado(){
        super();
    }
    
    
    @Override
    public String toString() {
        return "Quadrado{" + "lado1=" + super.getLado1() + ", lado2=" + super.getLado2() + ", cor=" + super.getCor() + "}";
    }
    
    

}
