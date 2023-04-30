import java.util.InputMismatchException;
import java.util.Scanner;
public class imc {
    public static void main(String[] args){
        float peso, altura, imc;

        Scanner sc = new Scanner(System.in);
        try {

        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();

        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();

        imc = peso/(altura*altura);
        System.out.printf("O seu imc é: %.2f", imc);

        } catch (InputMismatchException erro) {
            System.out.println("Por favor, digite com a vírgula");
        }

        sc.close();
    }
}
