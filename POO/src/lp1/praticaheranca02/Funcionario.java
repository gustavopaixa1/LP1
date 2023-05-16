package lp1.praticaheranca02;

public class Funcionario {
    protected String nome;
    protected Float salario;
    protected String ID;

    public Funcionario(String nome, Float salario, String ID) {
        this.nome = nome;
        this.salario = salario;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ID='" + ID + '\'' +
                '}';
    }
}
