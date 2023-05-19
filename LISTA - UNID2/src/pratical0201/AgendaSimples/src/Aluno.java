package agendaSimples.src;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>();
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

    public String getInfo() {
        return String.format("%s | %s | %s | %s\n", this.getNome(), this.getEmail(), this.getTelefone(), this.getMatricula());
    }

    public int getResponsaveisCadastrados() {
        return this.responsaveis.size();
    }

    public Responsavel getResponsavel(int indice) {
        if (0 <= indice && indice < this.getResponsaveisCadastrados())
            return this.responsaveis.get(indice);
        return null;
    }

    // Construtor
    public Aluno(String nome, String email, String telefone, int matricula) {
        super(nome, email, telefone);
        setMatricula(matricula);
    }

    // Métodos
    public void addResponsavel(Responsavel responsavel) {
        this.responsaveis.add(responsavel);
    }

    public void remResponsavel(Responsavel responsavel) {
        this.responsaveis.remove(responsavel);
    }

    public boolean eResponsavel(Responsavel responsavel) {
        for (Responsavel r : this.responsaveis)
            if (responsavel.equals(r))
                return true;
        return false;
    }
}
