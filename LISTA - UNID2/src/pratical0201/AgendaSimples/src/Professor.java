package AgendaSimples.src;

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

    public int getMatricula() {
        return this.matricula;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    // Construtor
    public Professor(String nome, String email, String telefone, int matricula, String disciplina) {
        super(nome, email, telefone);
        setMatricula(matricula);
        setDisciplina(disciplina);
    }
}
