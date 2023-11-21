package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class userIn {
    public static void main(String[] args) {

        String ufn, ud;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a file name: ");
        ufn = scan.nextLine();

        try (PrintWriter pw = new PrintWriter(new FileWriter(ufn, true))) {
            System.out.println("Please enter your data: ");
            ud = scan.nextLine();

            pw.println(ud);

            System.out.println("Success");

        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
