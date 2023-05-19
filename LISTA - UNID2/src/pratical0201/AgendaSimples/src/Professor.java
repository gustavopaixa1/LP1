package agendaSimples.src;

public class Professor extends Pessoa {
    private int matricula;
    private String disciplina;

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

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public String getInfo() {
        return String.format("%s | %s | %s | %s | %s\n", this.getNome(), this.getEmail(), this.getTelefone(), this.getMatricula(), this.getDisciplina());
    }

    // Construtor
    public Professor(String nome, String email, String telefone, int matricula, String disciplina) {
        super(nome, email, telefone);
        setMatricula(matricula);
        setDisciplina(disciplina);
    }
}
