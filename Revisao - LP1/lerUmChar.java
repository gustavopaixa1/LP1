import java.util.Scanner;
public class lerUmChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char teste;
        teste = sc.nextLine().charAt(0);

        System.out.printf("%c", teste);
    }
}
