import java.io.*;
import java.util.Scanner;

/**
 * Created by shybovycha on 07.10.14.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileReader("in.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
            IBANValidator validator = new IBANValidator();

            while (in.hasNextLine()) {
                String line = in.nextLine();
                validator.setLine(line);

                out.print(validator.getLine());

                if (validator.validate()) {
                    out.println(" POPRAWNY");
                } else {
                    out.println(" BŁĘDNY");
                }
            }

            in.close();
            out.close();
        } catch (Exception e) {
            System.out.printf("Something went wrong: %s\nAt:\n", e.getMessage());
            e.printStackTrace();
        }
    }
}
