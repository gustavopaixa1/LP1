package lp1.praticaheranca02;

public class Gerente extends Funcionario {
    public Gerente(String nome, Float salario, String ID) {
        super(nome, salario, ID);
    }

    @Override
    public Float getSalario() {
        return super.getSalario() * 1.2f;
    }

}
