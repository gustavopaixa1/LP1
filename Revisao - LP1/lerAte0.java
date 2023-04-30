import java.util.Scanner;

public class lerAte0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = 1, nota2, media;
        while (nota1 != 0) {
            System.out.println("Digite a nota 1 e a nota 2: ");
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.printf("A média é: %.2f%n", media);
        }

        System.out.println("Programa encerrado");

    }
}
