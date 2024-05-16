package br.com.guilhermevillaca;

/**
 *
 * @author villaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Quadrado fig = new Quadrado(5, 5, "Preto");
        System.out.println(fig.toString());
        System.out.println("---------");
        Retangulo ret = new Retangulo(3, 9, "Azul");
        System.out.println(ret.toString());
        System.out.println("----------");
        
        Triangulo tri = new Triangulo(6, 8, "Amarelo");
        System.out.println(tri.toString());
        
        System.out.println("----------");
        
        Circulo cir = new Circulo(64, "Verde");
        System.out.println(cir.toString());
        
        System.out.println("---------");
    }

}
