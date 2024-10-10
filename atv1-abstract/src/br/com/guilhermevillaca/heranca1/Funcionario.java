package br.com.guilhermevillaca.heranca1;

/**
 *
 * @author 10380
 */
public abstract class Funcionario extends Pessoa {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
