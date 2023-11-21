package ie.atu;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class userIn {
    public static void main(String[] args) {

        String ufn, ud;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a file name: ");
        ufn = scan.nextLine();

        try (FileReader fr = new FileReader(ufn)) {


            System.out.println("Success");

        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
