package AgendaSimples.src;

import java.util.ArrayList;
import tools.Validator;

public class Escola {
    private final int NUMERO_DE_ALUNOS_MAXIMO = 10, NUMERO_DE_PROFESSORES_MAXIMO = 5;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>();
    private Validator vd = new Validator(System.in);

    // Construtores
    public Escola() {
    }

    public Escola(boolean usarBancoDeDados) {
        this.popularComBancoDeDados();
    }

    // Métodos
    public void popularComBancoDeDados() {
        EscolaDB db = new EscolaDB();
        for (int i = 0; i < db.NUMERO_DE_ALUNOS; i++)
            this.alunos.add(db.alunos[i]);
        for (int i = 0; i < db.NUMERO_DE_PROFESSORES; i++)
            this.professores.add(db.professores[i]);
        for (int i = 0; i < db.NUMERO_DE_RESPONSAVEIS; i++)
            this.responsaveis.add(db.responsaveis[i]);
        db = null;
    }

    public void adicionarAluno() {
        if (this.alunos.size() >= NUMERO_DE_ALUNOS_MAXIMO)
            System.out.printf("\nO total de alunos já foi atingido.\n\n");
        else {
            String nome = this.vd.validateString("Por favor, digite o nome do aluno: ",
                    "Por favor, digite um nome válido. Não pode ser vazio ou possuir caracteres fora do alfabeto.\n\n",
                    (n) -> {
                        return n.replaceAll("[^a-z ^A-Z]", "").length() > 0;
                    }).replaceAll("[^a-z ^A-Z]", "");
            String email = this.vd.validateString("Por favor, digite o email do aluno: ",
                    "Por favor, digite um email válido. Não pode ser vazio.\n\n",
                    (n) -> {
                        return true;
                    });
            String telefone = this.vd.validateString("Por favor, digite o telefone do aluno: ",
                    "Por favor, digite um telefone válido. Não pode possuir menos que 8 ou mais que 13 números.\n\n",
                    (n) -> {
                        int aux = n.replaceAll("[^0-9]", "").length();
                        return 8 <= aux && aux <= 13;
                    });
            int matricula = this.vd.validateInt("Por favor, digite a matrícula do aluno: ",
                    "Por favor, digite uma matrícula válida. Não pode ser menor que 0 ou maior que 99999.\n\n",
                    (n) -> {
                        return 0 <= n && n <= 99999;
                    });
            this.alunos.add(new Aluno(nome, email, telefone, matricula));
            System.out.printf("\nAluno cadastrado com sucesso.\n\n");
        }
    }

    public void adicionarProfessor() {
        if (this.professores.size() >= NUMERO_DE_PROFESSORES_MAXIMO)
            System.out.printf("\nO total de professores já foi atingido.\n\n");
        else {
            String nome = this.vd.validateString("Por favor, digite o nome do professor: ",
                    "Por favor, digite um nome válido. Não pode ser vazio ou possuir caracteres fora do alfabeto.\n\n",
                    (n) -> {
                        return n.replaceAll("[^a-z ^A-Z]", "").length() > 0;
                    }).replaceAll("[^a-z ^A-Z]", "");
            String email = this.vd.validateString("Por favor, digite o email do professor: ",
                    "Por favor, digite um email válido. Não pode ser vazio.\n\n",
                    (n) -> {
                        return true;
                    });
            String telefone = this.vd.validateString("Por favor, digite o telefone do professor: ",
                    "Por favor, digite um telefone válido. Não pode possuir menos que 8 ou mais que 13 números.\n\n",
                    (n) -> {
                        int aux = n.replaceAll("[^0-9]", "").length();
                        return 8 <= aux && aux <= 13;
                    });
            int matricula = this.vd.validateInt("Por favor, digite a matrícula do professor: ",
                    "Por favor, digite uma matrícula válida. Não pode ser menor que 0 ou maior que 99999.\n\n",
                    (n) -> {
                        return 0 <= n && n <= 99999;
                    });
            String disciplina = this.vd.validateString("Por favor, digite a disciplina do professor: ",
                    "Por favor, digite uma disciplina válida. Não pode ser vazia.\n\n",
                    (n) -> {
                        return true;
                    });

            this.professores.add(new Professor(nome, email, telefone, matricula, disciplina));
            System.out.printf("\nProfessor cadastrado com sucesso.\n\n");
        }
    }

    public void adicionarResponsavel() {
        String nome = this.vd.validateString("Por favor, digite o nome do professor: ",
                "Por favor, digite um nome válido. Não pode ser vazio ou possuir caracteres fora do alfabeto.\n\n",
                (n) -> {
                    return n.replaceAll("[^a-z ^A-Z]", "").length() > 0;
                }).replaceAll("[^a-z ^A-Z]", "");
        String email = this.vd.validateString("Por favor, digite o email do professor: ",
                "Por favor, digite um email válido. Não pode ser vazio.\n\n",
                (n) -> {
                    return true;
                });
        String telefone = this.vd.validateString("Por favor, digite o telefone do professor: ",
                "Por favor, digite um telefone válido. Não pode possuir menos que 8 ou mais que 13 números.\n\n",
                (n) -> {
                    int aux = n.replaceAll("[^0-9]", "").length();
                    return 8 <= aux && aux <= 13;
                });

        this.responsaveis.add(new Responsavel(nome, email, telefone));
        System.out.printf("\nResponsável cadastrado com sucesso.\n\n");
    }

    public void relacionar() {
        if (this.alunos.size() == 0 || this.responsaveis.size() == 0)
            System.out.printf("\nNão há alunos e/ou responsáveis suficientes.\n\n");
        else {
            System.out.printf("Escolha um aluno para relacionar:\n");
            for (int i = 0; i < this.alunos.size(); i++)
                System.out.printf("%02d - %s\n", i + 1, this.alunos.get(i).getNome());
            int alunoEscolhido = vd.validateInt("Entre com o Índice do aluno escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return 1 <= n && n <= this.alunos.size();
                    }) - 1;

            int acao = vd.validateInt(
                    "Escolha uma opção:\n1 - Redefinir os responsáveis desse aluno ou definir pela primeira vez seu total de responsáveis.\n2 - Adicionar um novo responsável.\n",
                    "Por favor, digite uma opção válida, '1' ou '2'.\n\n",
                    (n) -> {
                        return n == 1 || n == 2;
                    });

            if (acao == 1)
                this.alunos.get(alunoEscolhido).setQuantiaDeResponsaveis(vd.validateInt(
                        "Entre com a quantia de responsáveis desse aluno: ",
                        "Por favor, digite uma quantia válida. Maior que 0.\n\n",
                        (n) -> {
                            return n > 0;
                        }));

            if (this.alunos.get(alunoEscolhido).limiteDeResponsaveis() > this.alunos.get(alunoEscolhido)
                    .getResponsaveisCadastrados()) {
                System.out.printf(
                        "Escolha um responsável para relacionar: (Os marcados com X já são responsáveis do aluno)\n");
                for (int i = 0; i < this.responsaveis.size(); i++)
                    if (!this.alunos.get(alunoEscolhido).eResponsavel(this.responsaveis.get(i)))
                        System.out.printf("%02d - %s\n", i + 1, this.responsaveis.get(i).getNome());
                    else
                        System.out.printf("X - %s\n", this.responsaveis.get(i).getNome());
                int responsavelEscolhido = vd.validateInt("Entre com o Índice do responsável escolhido: ",
                        "Por favor, digite um índice válido.\n\n",
                        (n) -> {
                            return 1 <= n && n <= this.responsaveis.size()
                                    && !this.alunos.get(alunoEscolhido).eResponsavel(this.responsaveis.get(n - 1));
                        }) - 1;

                acao = vd.validateInt(
                        "Escolha uma opção:\n1 - Redefinir os alunos desse responsável ou definir pela primeira vez seu total de alunos.\n2 - Adicionar um novo aluno.\n",
                        "Por favor, digite uma opção válida, '1' ou '2'.\n\n",
                        (n) -> {
                            return n == 1 || n == 2;
                        });

                if (acao == 1) {
                    this.responsaveis.get(responsavelEscolhido).setQuantiaDeAlunos(vd.validateInt(
                            "Entre com a quantia de alunos desse responsável: ",
                            "Por favor, digite uma quantia válida. Maior que 0.\n\n",
                            (n) -> {
                                return n > 0;
                            }));
                    this.alunos.get(alunoEscolhido).addResponsavel(this.responsaveis.get(responsavelEscolhido));
                    this.responsaveis.get(responsavelEscolhido).addAluno(this.alunos.get(alunoEscolhido));
                } else if (acao == 2 && this.responsaveis.get(responsavelEscolhido).limiteDeAlunos() > this.responsaveis
                        .get(responsavelEscolhido).getAlunosCadastrados()) {
                    this.alunos.get(alunoEscolhido).addResponsavel(this.responsaveis.get(responsavelEscolhido));
                    this.responsaveis.get(responsavelEscolhido).addAluno(this.alunos.get(alunoEscolhido));
                } else
                    System.out.printf(
                            "\nO responsável escolhido já chegou a seu máximo de alunos e/ou seu total de alunos ainda não foi definido.\n\n");
            } else
                System.out.printf(
                        "\nO aluno escolhido já chegou a seu máximo de responsáveis e/ou não há nenhum responsável disponíveis para ser adicionado.\n\n");
        }
    }


}
