package ie.atu;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("C:/Users/G00419267@atu.ie/IdeaProjects/Lab8/File13.txt");

            fw.write("New method2");

            System.out.println("Successful");

            fw.close();
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
