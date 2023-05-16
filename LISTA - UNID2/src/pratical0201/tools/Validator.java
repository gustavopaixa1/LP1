package tools;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.NoSuchElementException;

/**
 * The {@code Validator} class facilitates the user input.
 * Using the Scanner class and ensuring that it's methods returns the
 * required input.
 */
public class Validator {
    Scanner sc;
    boolean closed = false;

    /**
     * Constructs a new {@code Validator} that produces values scanned
     * from the specified input stream using the {@code Scanner} class.
     * 
     * @param source An input stream to be scanned
     */
    public Validator(InputStream source) {
        sc = new Scanner(source);
    }

    /**
     * Closes the Scanner used by this class.
     * 
     * @return the {@code boolean} indicating if the {@code Scanner} was closed
     */
    public boolean close() {
        if (closed)
            return false;
        sc.close();
        closed = true;
        return true;
    }

    /**
     * This method ensures that the input from the user will return
     * an Integer that meet the necessary requirements.
     * 
     * @param msg   A String which will be shown to the user
     * @param err   A String which will be shown to the user if the input don't meet
     *              the necessary requiriments
     * @param teste A Predicate that receives an Integer and that must return a
     *              boolean value
     * @return An Integer with the requirements informed in the Predicate
     * @throws IllegalStateException  if this class Scanner is closed
     * @throws NoSuchElementException if input is exhausted
     */
    public int validateInt(String msg, String err, Predicate<Integer> teste) {
        if (closed)
            throw new IllegalStateException("This class Scanner was already closed.");

        int aux = 0;
        while (true)
            try {
                System.out.printf(msg);
                aux = sc.nextInt();
                if (teste.test(aux))
                    break;
                throw new Exception();
            } catch (NoSuchElementException e) {
                System.out.printf("The input is exhausted.\n\n");
                break;
            } catch (Exception e) {
                System.out.printf(err);
                sc.nextLine();
            }
        sc.nextLine();
        return aux;
    }

    /**
     * This method ensures that the input from the user will return
     * a Double that meet the necessary requirements.
     * 
     * @param msg   A String which will be shown to the user.
     * @param err   A String which will be shown to the user if the input don't meet
     *              the necessary requiriments
     * @param teste A Predicate that receives a Double and that must return a
     *              boolean value
     * @return A Double with the requirements informed in the Predicate
     * @throws IllegalStateException  if this class Scanner is closed
     * @throws NoSuchElementException if input is exhausted
     */
    public double validateDouble(String msg, String err, Predicate<Double> teste) {
        if (closed)
            throw new IllegalStateException("This class Scanner was already closed.");

        double aux = 0;
        while (true)
            try {
                System.out.printf(msg);
                aux = sc.nextDouble();
                if (teste.test(aux))
                    break;
                throw new Exception();
            } catch (NoSuchElementException e) {
                System.out.printf("The input is exhausted.\n\n");
                break;
            } catch (Exception e) {
                System.out.printf(err);
                sc.nextLine();
            }
        sc.nextLine();
        return aux;
    }

    /**
     * This method ensures that the input from the user will return
     * a String that meet the necessary requirements.
     * 
     * @param msg   A String which will be shown to the user.
     * @param err   A String which will be shown to the user if the input don't meet
     *              the necessary requiriments
     * @param teste A Predicate that receives a String and that must return a
     *              boolean value
     * @return A String with the requirements informed in the Predicate
     * @throws IllegalStateException  if this class Scanner is closed
     * @throws NoSuchElementException if no line was found
     */
    public String validateString(String msg, String err, Predicate<String> teste) {
        if (closed)
            throw new IllegalStateException("This class Scanner was already closed.");

        String aux = "";
        while (true)
            try {
                System.out.printf(msg);
                aux = sc.nextLine().strip();
                if (teste.test(aux))
                    break;
                throw new Exception();
            } catch (NoSuchElementException e) {
                System.out.printf("No line was found.\n\n");
                break;
            } catch (Exception e) {
                System.out.printf(err);
            }
        return aux;
    }
}
