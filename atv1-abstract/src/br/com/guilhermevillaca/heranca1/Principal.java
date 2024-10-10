package br.com.guilhermevillaca.heranca1;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {       
              
        Aluno a = new Aluno();
        a.setNome("Joaquim");
        a.setIdade(18);
        a.setSexo('M');
        a.setEmail("joaquim@gmail.com");
        a.setMatricula(123456);        
        a.setNotas(new int[]{10, 5, 5, 6});
        
        System.out.println(a.getNome());
        System.out.println(a.getEmail());
        for(int nota: a.getNotas()){
            System.out.println(nota);
        }
        
        System.out.println("--------------------------------");
        
        Professor p = new Professor();
        p.setNome("Heloisa");
        p.setEmail("luis@gmail.com");
        p.setSexo('F');
        p.setSalario(22000);
        p.setDisciplinas(new String[]{"Poo, Startup, Banco de Dados, Algoritmo"});
        
        System.out.println(p.getNome());
        System.out.println(p.getEmail());
        System.out.println(p.getSalario());
        for(String disciplina: p.getDisciplinas()){
            System.out.println(disciplina);
        }
        
        
        System.out.println("--------------------------------");
        
    }

}
