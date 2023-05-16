package lp1.praticaheranca01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo",22, "Bancário Antonio Macau");
        Professor professor = new Professor("Renatha", 37, "Algum lugar", "Professora de Matemática", 10000);
        Aluno aluno = new Aluno("Luerson", 21, "Cabo Branco", "2022083129", "Ciência da Computação");

        System.out.println(pessoa.toString());
        System.out.println(professor.toString());
        System.out.println(aluno.toString());
    }
}
