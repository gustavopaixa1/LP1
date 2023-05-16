package lp1.praticaheranca01;

public class Aluno extends Pessoa {
    String matricula;
    String curso;

    public Aluno(String nome, int idade, String endereco, String matricula, String curso) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
