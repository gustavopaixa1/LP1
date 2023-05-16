package lp1.praticaheranca01;

public class Professor extends Pessoa {

    String disciplina;
    double salario;

    public Professor(String nome, int idade, String endereco, String disciplina, double salario) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
