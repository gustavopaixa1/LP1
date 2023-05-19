package agendaSimples.src;

import java.util.ArrayList;

public class Responsavel extends Pessoa {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    // Getters
    public String getInfo() {
        return String.format("%s | %s | %s\n", this.getNome(), this.getEmail(), this.getTelefone());
    }

    public int getAlunosCadastrados() {
        return this.alunos.size();
    }

    public Aluno getAluno(int indice) {
        if (0 <= indice && indice < this.getAlunosCadastrados())
            return this.alunos.get(indice);
        return null;
    }

    // Construtor
    public Responsavel(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    // Métodos
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void remAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean eAluno(Aluno aluno) {
        for (Aluno a : this.alunos)
            if (aluno.equals(a))
                return true;
        return false;
    }
}
