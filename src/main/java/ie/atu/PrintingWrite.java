package ie.atu;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintingWrite {
    public static void main(String[] args) {

        String fn = "File13.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(fn, true))) {
            pw.println("This is println");
            pw.print("This is printf");

            System.out.println("Success");

        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
