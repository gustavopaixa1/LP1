import java.util.Scanner;

public class mesAno {
    public static void main(String[] args) {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de um mês (1 a 12)");
        mes = sc.nextInt() - 1;

        switch (mes) {
            case 0: {
                System.out.print("Jan");
                break;
            }
            case 1: {
                System.out.print("Fev");
                break;
            }
            case 2: {
                System.out.print("Mar");
                break;
            }
            default:
                System.out.println("Um mes qualquer");

        }
        //System.out.printf("O mês é: %s", meses[mes]);
        sc.close();

    }
}
