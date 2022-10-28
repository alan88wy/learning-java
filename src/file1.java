import java.io.*;
public class file1 {
    public static void main(String[] args) {

        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("text.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    
}
