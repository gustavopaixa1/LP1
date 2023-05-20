/*
 * Exercício 01 - AgendaSimples
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */

package agendaSimples.bin;

import agendaSimples.src.Escola;
import tools.Validator;

public class Teste {
    private static Validator vd = new Validator(System.in);
    private static Escola escl;

    public static void main(String[] args) {
        String aux = vd.validateString("Deseja usar o banco de dados já pronto? (S/N) ",
                "Erro! Por favor, digite apenas 'S'(Sim) ou 'N'(Não)\n\n",
                (n) -> {
                    char c = n.toLowerCase().charAt(0);
                    return (c == 's' || c == 'n');
                });

        if (aux.toLowerCase().charAt(0) == 's')
            escl = new Escola(true);
        else
            escl = new Escola();

        int opt;
        while (true) {
            System.out.printf("\nO que deseja fazer?\n");
            System.out.printf("01 - Adicionar Pessoas\n");
            System.out.printf("02 - Remover Pessoas\n");
            System.out.printf("03 - Relacionar Alunos e Responsáveis\n");
            System.out.printf("04 - Visualizar Lista de Pessoas\n");
            System.out.printf("00 - Sair do Programa.\n");

            opt = vd.validateInt("Entre com a opção desejada: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return 0 <= n && n <= 4;
                    });

            if (opt == 0)
                break;

            switch (opt) {
                case 1:
                    adicionarPessoas();
                    break;
                case 2:
                    removerPessoas();
                    break;
                case 3:
                    escl.relacionar();
                    enterParaContinuar();
                    break;
                case 4:
                    visualizarPessoas();
            }
        }
    }

    private static void adicionarPessoas() {
        int opt;
        System.out.printf("\nO que deseja fazer?\n");
        System.out.printf("01 - Adicionar Aluno\n");
        System.out.printf("02 - Adicionar Professor\n");
        System.out.printf("03 - Adicionar Responsável\n");
        System.out.printf("00 - Voltar ao Menu Principal.\n");

        opt = vd.validateInt("Entre com a opção desejada: ",
                "Por favor, digite um índice válido.\n\n",
                (n) -> {
                    return 0 <= n && n <= 3;
                });

        switch (opt) {
            case 1:
                escl.adicionarAluno();
                break;
            case 2:
                escl.adicionarProfessor();
                break;
            case 3:
                escl.adicionarResponsavel();
        }
        if (opt != 0)
            enterParaContinuar();
    }

    private static void removerPessoas() {
        int opt;
        System.out.printf("\nO que deseja fazer?\n");
        System.out.printf("01 - Remover Aluno\n");
        System.out.printf("02 - Remover Professor\n");
        System.out.printf("03 - Remover Responsável\n");
        System.out.printf("00 - Voltar ao Menu Principal.\n");

        opt = vd.validateInt("Entre com a opção desejada: ",
                "Por favor, digite um índice válido.\n\n",
                (n) -> {
                    return 0 <= n && n <= 3;
                });

        switch (opt) {
            case 1:
                escl.removerAluno();
                break;
            case 2:
                escl.removerProfessor();
                break;
            case 3:
                escl.removerResponsavel();
        }

        if (opt != 0)
            enterParaContinuar();
    }

    private static void visualizarPessoas() {
        int opt;
        System.out.printf("\nO que deseja fazer?\n");
        System.out.printf("01 - Ver Lista de Pessoas\n");
        System.out.printf("02 - Ver Lista de Alunos\n");
        System.out.printf("03 - Ver Lista de Professores\n");
        System.out.printf("04 - Ver Lista de Responsáveis\n");
        System.out.printf("05 - Buscar Informações por Nome\n");
        System.out.printf("06 - Buscar Informações por ID (Ver valor nas listas das opções 1-4)\n");
        System.out.printf("00 - Voltar ao Menu Principal.\n");

        opt = vd.validateInt("Entre com a opção desejada: ",
                "Por favor, digite um índice válido.\n\n",
                (n) -> {
                    return 0 <= n && n <= 6;
                });

        switch (opt) {
            case 1:
                System.out.println(escl.listaDePessoas());
                break;
            case 2:
                System.out.println(escl.listaDeAlunos());
                break;
            case 3:
                System.out.println(escl.listaDeProfessores());
                break;
            case 4:
                System.out.println(escl.listaDeResponsaveis());
                break;
            case 5:
                escl.buscarNome();
                break;
            case 6:
                escl.buscarID();
        }

        if (opt != 0)
            enterParaContinuar();
    }

    private static void enterParaContinuar() {
        vd.validateString("\nPressione 'Enter' para continuar.",
                "Um erro inesperado ocorreu.\n\n",
                (n) -> {
                    return true;
                });
    }
}
