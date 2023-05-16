package AgendaSimples.src;

public class Responsavel extends Pessoa {
    private Aluno[] alunos;
    private int totalDeAlunos = 0;
    private int alunosCadastrados = 0;

    // Getters
    public int limiteDeAlunos() {
        return this.totalDeAlunos;
    }

    public int getAlunosCadastrados() {
        return this.alunosCadastrados;
    }

    public String getInfo() {
        return String.format("%s | %s | %s\n", this.nome, this.email, this.telefone);
    }

    public Aluno getAluno(int indice) {
        if (0 <= indice && indice < this.alunosCadastrados)
            return this.alunos[indice];
        return null;
    }

    // Construtor
    public Responsavel(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    // Métodos
    public void setQuantiaDeAlunos(int quantia) {
        this.alunos = new Aluno[quantia];
        this.totalDeAlunos = quantia;
        this.alunosCadastrados = 0;
    }

    public void addAluno(Aluno aluno) {
        if (this.alunosCadastrados < this.limiteDeAlunos())
            this.alunos[this.alunosCadastrados++] = aluno;
        else
            System.out.printf("O total de alunos já foi atingido.\n\n");
    }

    public boolean eAluno(Aluno aluno) {
        for (Aluno a : this.alunos)
            if (aluno.equals(a))
                return true;
        return false;
    }
}
