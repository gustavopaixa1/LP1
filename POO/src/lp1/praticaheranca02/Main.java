package lp1.praticaheranca02;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", 2000f, "1");
        System.out.printf("%.2f\n", f.getSalario());

        Gerente g = new Gerente("Marcos", 2000f, "2");
        System.out.printf("%.2f", g.getSalario());
    }
}
