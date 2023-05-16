package AgendaSimples.src;

public class Aluno extends Pessoa {
    private Responsavel[] responsaveis;
    private int totalDeResponsaveis = 0;
    private int responsaveisCadastrados = 0;
    private int matricula;

    // Getters e Setters
    public void setMatricula(int matricula) {
        if (matricula < 0 || matricula > 99999) {
            System.out.printf("Matrícula informada inválida, armazenada como '00000'.\n\n");
            this.matricula = 0;
        } else {
            this.matricula = matricula;
        }
    }

    public String getMatricula() {
        return String.format("%05d", this.matricula);
    }

    public int limiteDeResponsaveis() {
        return this.totalDeResponsaveis;
    }

    public int getResponsaveisCadastrados() {
        return this.responsaveisCadastrados;
    }

    public String getInfo() {
        return String.format("%s | %s | %s | %s\n", this.nome, this.email, this.telefone, this.matricula);
    }

    public Responsavel getResponsavel(int indice) {
        if (0 <= indice && indice < this.responsaveisCadastrados)
            return this.responsaveis[indice];
        return null;
    }

    // Construtor
    public Aluno(String nome, String email, String telefone, int matricula) {
        super(nome, email, telefone);
        setMatricula(matricula);
    }

    // Métodos
    public void setQuantiaDeResponsaveis(int quantia) {
        this.responsaveis = new Responsavel[quantia];
        this.totalDeResponsaveis = quantia;
        this.responsaveisCadastrados = 0;
    }

    public void addResponsavel(Responsavel responsavel) {
        if (this.responsaveisCadastrados < this.limiteDeResponsaveis())
            this.responsaveis[this.responsaveisCadastrados++] = responsavel;
        else
            System.out.printf("O total de responsáveis já foi atingido.\n\n");
    }

    public boolean eResponsavel(Responsavel responsavel) {
        for (Responsavel r : this.responsaveis)
            if (responsavel.equals(r))
                return true;
        return false;
    }
}
