package lp1.pratica02;

import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Digite o salário bruto do funcionário: ");
        funcionario.setSalarioBruto(sc.nextFloat());

        System.out.print("Digite os impostos sobre o salário bruto do funcionário: ");
        funcionario.setImposto(sc.nextFloat());

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário antes do aumento: " + funcionario.salarioLiquido(funcionario.getSalarioBruto(), funcionario.getImposto()) + "\n");

        System.out.print("Digite o aumento em cima do salário bruto: ");
        float aumento = sc.nextFloat();
        funcionario.aumento(funcionario.getSalarioBruto(), aumento);

        System.out.println("Nome do funcionário: " + funcionario.getNome() + "\n");
        System.out.println("Salário após o aumento: " + funcionario.salarioLiquido(funcionario.getSalarioBruto(), funcionario.getImposto()));

        sc.close();
    }
}
