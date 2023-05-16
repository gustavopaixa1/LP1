package lp1.pratica03;

import java.util.Scanner;

public class UsaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        char continuar = 's';

        while (continuar == 's') {

            System.out.print("Digite o nome do aluno: ");
            aluno.setNome(sc.nextLine());

            System.out.print("Digite a N1: ");
            aluno.setNota1(sc.nextInt());
            sc.nextLine();
            if (aluno.getNota1() < 0 || aluno.getNota1() > 30) {
                System.out.println("Nota inválida, digitar uma nota de 0 a 30");
                continue;
            } else {
                System.out.println("Nota cadastrada!");
            }

            System.out.print("Digite a N2: ");
            aluno.setNota2(sc.nextInt());
            sc.nextLine();
            if (aluno.getNota2() < 0 || aluno.getNota2() > 35) {
                System.out.println("Nota inválida, digitar uma nota de 0 a 30");
                continue;
            } else {
                System.out.println("Nota cadastrada!");
            }

            System.out.print("Digite a N3: ");
            aluno.setNota3(sc.nextInt());
            sc.nextLine();
            if (aluno.getNota3() < 0 || aluno.getNota3() > 35) {
                System.out.println("Nota inválida, digitar uma nota de 0 a 30");
                continue;
            } else {
                System.out.println("Nota cadastrada!");
            }
            resultado(aluno.getNome(), aluno.getNota1(), aluno.getNota2(), aluno.getNota3());

            System.out.println("Digite s para continuar: ");
            continuar = sc.next().charAt(0);
            sc.nextLine();

        }
        sc.close();
    }

    public static void resultado(String nome, int nota1, int nota2, int nota3) {
        int notaFinal = nota1 + nota2 + nota3;
        if (notaFinal >= 60) {
            System.out.printf("NOTA FINAL = %d, PASSOU\n\n", notaFinal);
        } else {
            System.out.printf("NOTA FINAL = %d, FALHOU. ", notaFinal);
            System.out.printf("%s, você precisa de %d pontos para passar\n",nome , 60 - notaFinal);
        }
    }
}