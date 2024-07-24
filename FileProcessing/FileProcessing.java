import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessing{

    public static void main(String[] args) {
        String fileName = args[0] ;
        try{
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}