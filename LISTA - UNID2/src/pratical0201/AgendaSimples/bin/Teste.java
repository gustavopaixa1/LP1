package AgendaSimples.bin;

import AgendaSimples.src.Escola;
import tools.Validator;

public class Teste {
    public static void main(String[] args) {
        Validator vd = new Validator(System.in);
        Escola escl;

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
            System.out.printf("01 - Adicionar Aluno\n");
            System.out.printf("02 - Adicionar Professor\n");
            System.out.printf("03 - Adicionar Responsável\n");
            System.out.printf("04 - Relacionar Alunos e Responsáveis\n");
            System.out.printf("05 - Ver Lista de Pessoas\n");
            System.out.printf("06 - Ver Lista de Alunos\n");
            System.out.printf("07 - Ver Lista de Professores\n");
            System.out.printf("08 - Ver Lista de Responsáveis\n");
            System.out.printf("09 - Buscar Informações por Nome\n");
            System.out.printf("10 - Buscar Informações por ID (Ver valor nas listas das opções 5-8)\n");
            System.out.printf("00 - Sair do Programa.\n");

            opt = vd.validateInt("Entre com a opção desejada: ",
                    "Por favor, digite um índice válido.\n\n",
                    (n) -> {
                        return 0 <= n && n <= 10;
                    });

            if (opt == 0)
                break;

            switch (opt) {
                case 1:
                    escl.adicionarAluno();
                    break;
                case 2:
                    escl.adicionarProfessor();
                    break;
                case 3:
                    escl.adicionarResponsavel();
                    break;
                case 4:
                    escl.relacionar();
                    break;
                case 5:
                    System.out.println(escl.listaDePessoas());
                    break;
                case 6:
                    System.out.println(escl.listaDeAlunos());
                    break;
                case 7:
                    System.out.println(escl.listaDeProfessores());
                    break;
                case 8:
                    System.out.println(escl.listaDeResponsaveis());
                    break;
                case 9:
                    escl.buscarNome();
                    break;
                case 10:
                    escl.buscarID();
            }

            vd.validateString("\nPressione 'Enter' para continuar.",
                    "Um erro inesperado ocorreu.\n\n",
                    (n) -> {
                        return true;
                    });
        }

    }
}
