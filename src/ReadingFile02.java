import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile02 {
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(new File("text.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
