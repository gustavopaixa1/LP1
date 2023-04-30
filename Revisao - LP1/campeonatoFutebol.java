import java.util.Scanner;

public class campeonatoFutebol {
    public static void main(String[] args) {
        int lider, lanterna, vitoriasNecessarias;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pontos do líder: ");
        lider = sc.nextInt();

        System.out.println("Digite a quantidade de pontos do lanterna: ");
        lanterna = sc.nextInt();

        vitoriasNecessarias = (lider - lanterna) / 3;
        System.out.println("A quantidade de vitórias necessárias é: " + vitoriasNecessarias);
        System.out.println();
        sc.close();

    }
}
