package agendaSimples.src;

import tools.Validator;
import java.util.ArrayList;
import java.lang.StringBuilder;

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
        if (usarBancoDeDados)
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
            String nome = this.vd.validateString("\nPor favor, digite o nome do aluno: ",
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
            String nome = this.vd.validateString("\nPor favor, digite o nome do professor: ",
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
        String nome = this.vd.validateString("\nPor favor, digite o nome do responsável: ",
                "Por favor, digite um nome válido. Não pode ser vazio ou possuir caracteres fora do alfabeto.\n\n",
                (n) -> {
                    return n.replaceAll("[^a-z ^A-Z]", "").length() > 0;
                }).replaceAll("[^a-z ^A-Z]", "");
        String email = this.vd.validateString("Por favor, digite o email do responsável: ",
                "Por favor, digite um email válido. Não pode ser vazio.\n\n",
                (n) -> {
                    return true;
                });
        String telefone = this.vd.validateString("Por favor, digite o telefone do responsável: ",
                "Por favor, digite um telefone válido. Não pode possuir menos que 8 ou mais que 13 números.\n\n",
                (n) -> {
                    int aux = n.replaceAll("[^0-9]", "").length();
                    return 8 <= aux && aux <= 13;
                });

        this.responsaveis.add(new Responsavel(nome, email, telefone));
        System.out.printf("\nResponsável cadastrado com sucesso.\n\n");
    }

    public void removerAluno() {
        if (this.alunos.size() > 0) {
            int indice = 1;
            System.out.printf("\nEscolha um aluno para remover:\n");
            for (int i = 0; i < this.alunos.size(); i++)
                System.out.printf("%02d - %s\n", i + indice, this.alunos.get(i).getNome());
            int alunoEscolhido = vd.validateInt("Entre com o Índice do aluno escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return indice <= n && n < this.alunos.size() + indice;
                    }) - indice;

            Aluno alunoExcluido = this.alunos.get(alunoEscolhido);

            if (alunoExcluido.getResponsaveisCadastrados() > 0)
                while (alunoExcluido.getResponsaveisCadastrados() > 0)
                    alunoExcluido.getResponsavel(0).remAluno(alunoExcluido);

            this.alunos.remove(alunoExcluido);
            alunoExcluido = null;
            System.out.printf("\nRemoção realizada com sucesso.\n\n");
        }
    }

    public void removerProfessor() {
        if (this.professores.size() > 0) {
            int indice = 1 + this.alunos.size();
            System.out.printf("\nEscolha um professor para remover:\n");
            for (int i = 0; i < this.professores.size(); i++)
                System.out.printf("%02d - %s\n", i + indice, this.professores.get(i).getNome());
            int professorEscolhido = vd.validateInt("Entre com o Índice do professor escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return indice <= n && n < this.professores.size() + indice;
                    }) - indice;

            Professor professorExcluido = this.professores.get(professorEscolhido);
            this.professores.remove(professorExcluido);
            professorExcluido = null;
            System.out.printf("\nRemoção realizada com sucesso.\n\n");
        }
    }

    public void removerResponsavel() {
        if (this.responsaveis.size() > 0) {
            int indice = 1 + this.alunos.size() + this.professores.size();
            System.out.printf("\nEscolha um responsável para remover:\n");
            for (int i = 0; i < this.responsaveis.size(); i++)
                System.out.printf("%02d - %s\n", i + indice, this.responsaveis.get(i).getNome());
            int responsavelEscolhido = vd.validateInt("Entre com o Índice do responsável escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return indice <= n && n < this.responsaveis.size() + indice;
                    }) - indice;

            Responsavel responsavelExcluido = this.responsaveis.get(responsavelEscolhido);

            if (responsavelExcluido.getAlunosCadastrados() > 0)
                while (responsavelExcluido.getAlunosCadastrados() > 0)
                    responsavelExcluido.getAluno(0).remResponsavel(responsavelExcluido);

            this.responsaveis.remove(responsavelExcluido);
            responsavelExcluido = null;
            System.out.printf("\nRemoção realizada com sucesso.\n\n");
        }
    }

    public void relacionar() {
        if (this.alunos.size() == 0 || this.responsaveis.size() == 0)
            System.out.printf("\nNão há alunos e/ou responsáveis suficientes.\n\n");
        else {
            System.out.printf("\nEscolha um aluno para relacionar:\n");
            for (int i = 0; i < this.alunos.size(); i++)
                System.out.printf("%02d - %s\n", i + 1, this.alunos.get(i).getNome());
            int alunoEscolhido = vd.validateInt("Entre com o Índice do aluno escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return 1 <= n && n <= this.alunos.size();
                    }) - 1;

            System.out.printf(
                    "\nEscolha um responsável para relacionar: (Os marcados com X já são responsáveis do aluno)\n");
            for (int i = 0; i < this.responsaveis.size(); i++)
                if (this.alunos.get(alunoEscolhido).eResponsavel(this.responsaveis.get(i)))
                    System.out.printf("X - %s\n", this.responsaveis.get(i).getNome());
                else
                    System.out.printf("%02d - %s\n", i + 1, this.responsaveis.get(i).getNome());
            int responsavelEscolhido = vd.validateInt("\nEntre com o Índice do responsável escolhido: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return 1 <= n && n <= this.responsaveis.size();
                    }) - 1;

            if (this.alunos.get(alunoEscolhido).eResponsavel(this.responsaveis.get(responsavelEscolhido)))
                System.out
                        .printf("\nRelação não concluída. O aluno e responsáveis escolhidos já são relacionados.\n\n");
            else {
                this.alunos.get(alunoEscolhido).addResponsavel(this.responsaveis.get(responsavelEscolhido));
                this.responsaveis.get(responsavelEscolhido).addAluno(this.alunos.get(alunoEscolhido));
                System.out.printf("\nRelação realizada com sucesso.\n\n");
            }
        }
    }

    public String listaDePessoas() {
        if (this.alunos.size() == 0 && this.professores.size() == 0 && this.responsaveis.size() == 0)
            return "\nNão há pessoas cadastradas.\n";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(listaDeAlunos());
            sb.append(listaDeProfessores());
            sb.append(listaDeResponsaveis());

            return sb.toString();
        }
    }

    public String listaDeAlunos() {
        if (this.alunos.size() == 0)
            return "\nNão há alunos cadastrados.\n";
        else {
            StringBuilder sb = new StringBuilder();
            int indice = 1, i;

            sb.append("\nAlunos:\n");
            for (i = 0; i < this.alunos.size(); i++) {
                Aluno aux = this.alunos.get(i);
                sb.append(i + indice).append(" - ")
                        .append(aux.getNome()).append(" | ")
                        .append(aux.getEmail()).append(" | ")
                        .append(aux.getTelefone()).append(" | ")
                        .append(aux.getMatricula()).append("\n");
            }

            return sb.toString();
        }
    }

    public String listaDeProfessores() {
        if (this.professores.size() == 0)
            return "\nNão há professores cadastrados.\n";
        else {
            StringBuilder sb = new StringBuilder();
            int indice = 1 + this.alunos.size();

            sb.append("\nProfessores:\n");
            for (int i = 0; i < this.professores.size(); i++) {
                Professor aux = this.professores.get(i);
                sb.append(i + indice).append(" - ")
                        .append(aux.getNome()).append(" | ")
                        .append(aux.getEmail()).append(" | ")
                        .append(aux.getTelefone()).append(" | ")
                        .append(aux.getMatricula()).append(" | ")
                        .append(aux.getDisciplina()).append("\n");
            }

            return sb.toString();
        }
    }

    public String listaDeResponsaveis() {
        if (this.responsaveis.size() == 0)
            return "\nNão há responsáveis cadastrados.\n";
        else {
            StringBuilder sb = new StringBuilder();
            int indice = 1 + this.alunos.size() + this.professores.size();

            sb.append("\nResponsáveis:\n");
            for (int i = 0; i < this.responsaveis.size(); i++) {
                Responsavel aux = this.responsaveis.get(i);
                sb.append(i + indice).append(" - ")
                        .append(aux.getNome()).append(" | ")
                        .append(aux.getEmail()).append(" | ")
                        .append(aux.getTelefone()).append("\n");
            }

            return sb.toString();
        }
    }

    public void buscarNome() {
        String nome = this.vd.validateString("\nPor favor, digite o nome da pessoa a ser procurada: ",
                "Por favor, digite um nome válido. Não pode ser vazio ou possuir caracteres fora do alfabeto.\n",
                (n) -> {
                    return n.replaceAll("[^a-z ^A-Z]", "").length() > 0;
                }).replaceAll("[^a-z ^A-Z]", "").strip();

        Pessoa pessoaBuscada = null;
        String tipoDePessoa = "";
        for (Aluno a : this.alunos)
            if (nome.equalsIgnoreCase(a.getNome().strip())) {
                pessoaBuscada = a;
                tipoDePessoa = "aluno";
                break;
            }

        if (pessoaBuscada == null)
            for (Professor p : this.professores)
                if (nome.equalsIgnoreCase(p.getNome().strip())) {
                    pessoaBuscada = p;
                    break;
                }

        if (pessoaBuscada == null)
            for (Responsavel r : this.responsaveis)
                if (nome.equalsIgnoreCase(r.getNome().strip())) {
                    pessoaBuscada = r;
                    tipoDePessoa = "responsavel";
                    break;
                }

        if (pessoaBuscada == null)
            System.out.printf("\nNinguém com esse nome foi encontrado.\n");
        else {
            System.out.printf("As informações da pessoa encontrada são estas:\n");
            System.out.printf(pessoaBuscada.getInfo());
        }

        if (tipoDePessoa.equals("aluno")) {
            if (((Aluno) pessoaBuscada).getResponsaveisCadastrados() > 0) {
                Aluno alunoEncontrado = (Aluno) pessoaBuscada;
                System.out.printf("\nE as informações de seus responsáveis são:\n");
                for (int i = 0; i < alunoEncontrado.getResponsaveisCadastrados(); i++)
                    System.out.printf(alunoEncontrado.getResponsavel(i).getInfo());
            }
        } else if (tipoDePessoa.equals("responsavel")) {
            if (((Responsavel) pessoaBuscada).getAlunosCadastrados() > 0) {
                Responsavel responsavelEncontrado = (Responsavel) pessoaBuscada;
                System.out.printf("\nE as informações de seus dependentes são:\n");
                for (int i = 0; i < responsavelEncontrado.getAlunosCadastrados(); i++)
                    System.out.printf(responsavelEncontrado.getAluno(i).getInfo());
            }
        }
    }

    public void buscarID() {
        int ID = this.vd.validateInt("\nPor favor, digite o ID da pessoa a ser procurada: ",
                "Por favor, digite um ID válido.\n",
                (n) -> {
                    return 1 <= n && n <= this.alunos.size() + this.professores.size() + this.responsaveis.size();
                });

        Pessoa pessoaBuscada = null;
        String tipoDePessoa = "";
        int quantiaDeAlunos = this.alunos.size();
        int quantiaDeProfessores = this.professores.size();
        int quantiaDeResponsaveis = this.responsaveis.size();

        if (ID <= quantiaDeAlunos) {
            pessoaBuscada = this.alunos.get(ID - 1);
            tipoDePessoa = "aluno";
        } else if (ID <= quantiaDeAlunos + quantiaDeProfessores) {
            pessoaBuscada = this.professores.get(ID - 1 - quantiaDeAlunos);
        } else if (ID <= quantiaDeAlunos + quantiaDeProfessores + quantiaDeResponsaveis) {
            pessoaBuscada = this.responsaveis.get(ID - 1 - quantiaDeAlunos - quantiaDeProfessores);
            tipoDePessoa = "responsavel";
        }

        System.out.printf("As informações da pessoa encontrada são estas:\n");
        System.out.printf(pessoaBuscada.getInfo());

        if (tipoDePessoa.equals("aluno")) {
            if (((Aluno) pessoaBuscada).getResponsaveisCadastrados() > 0) {
                Aluno alunoEncontrado = (Aluno) pessoaBuscada;
                System.out.printf("\nE as informações de seus responsáveis são:\n");
                for (int i = 0; i < alunoEncontrado.getResponsaveisCadastrados(); i++)
                    System.out.printf(alunoEncontrado.getResponsavel(i).getInfo());
            }
        } else if (tipoDePessoa.equals("responsavel")) {
            if (((Responsavel) pessoaBuscada).getAlunosCadastrados() > 0) {
                Responsavel responsavelEncontrado = (Responsavel) pessoaBuscada;
                System.out.printf("\nE as informações de seus dependentes são:\n");
                for (int i = 0; i < responsavelEncontrado.getAlunosCadastrados(); i++)
                    System.out.printf(responsavelEncontrado.getAluno(i).getInfo());
            }
        }
    }
}
