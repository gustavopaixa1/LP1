package AgendaSimples.src;

public class EscolaDB {
        public final int NUMERO_DE_ALUNOS = 10, NUMERO_DE_PROFESSORES = 5, NUMERO_DE_RESPONSAVEIS = 10;

        public Aluno[] alunos = {
                        new Aluno("Alexandre", "Alexandre@email.com", "5583987654321", 10001),
                        new Aluno("Alisson", "Alisson@email.com", "5583987654321", 10002),
                        new Aluno("Alysson", "Alysson@email.com", "5583987654321", 10003),
                        new Aluno("Ana_B", "Ana_B@email.com", "5583987654321", 10004),
                        new Aluno("Ana_P", "Ana_P@email.com", "5583987654321", 10005),
                        new Aluno("Anna_M", "Anna_M@email.com", "5583987654321", 10006),
                        new Aluno("Arthur", "Arthur@email.com", "5583987654321", 10007),
                        new Aluno("Barbara", "Barbara@email.com", "5583987654321", 10008),
                        new Aluno("Brunelly", "Brunelly@email.com", "5583987654321", 10009),
                        new Aluno("Camila", "Camila@email.com", "5583987654321", 10010)
        };

        public Professor[] professores = {
                        new Professor("Carlos", "Carlos@email.com", "5583987654321", 10011, "Cálculo"),
                        new Professor("Ciro", "Ciro@email.com", "5583987654321", 10012, "Física"),
                        new Professor("Daniel", "Daniel@email.com", "5583987654321", 10013, "Álgebra"),
                        new Professor("Eliane", "Eliane@email.com", "5583987654321", 10014, "Filosofia"),
                        new Professor("Dani", "Dani@email.com", "5583987654321", 1, "Programação")
        };

        public Responsavel[] responsaveis = {
                        new Responsavel("Dmitri", "Dmitri@email.com", "5583987654321"),
                        new Responsavel("Euro", "Euro@email.com", "5583987654321"),
                        new Responsavel("Felipe", "Felipe@email.com", "5583987654321"),
                        new Responsavel("Fernando", "Fernando@email.com", "5583987654321"),
                        new Responsavel("Guilherme", "Guilherme@email.com", "5583987654321"),
                        new Responsavel("Herick", "Herick@email.com", "5583987654321"),
                        new Responsavel("Ialisson", "Ialisson@email.com", "5583987654321"),
                        new Responsavel("Jay", "Jay@email.com", "5583987654321"),
                        new Responsavel("Joao", "Joao@email.com", "5583987654321"),
                        new Responsavel("Luana", "Luana@email.com", "5583987654321")
        };
}
