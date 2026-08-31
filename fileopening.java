import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOpener {
    public static void main(String[] args) {
        // Specify the path to your file (e.g., "C:\\data\\example.txt" on Windows)
        String filePath = "example.txt"; 

        // The try-with-resources block automatically closes the file when done
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("--- Reading File Content ---");
            
            // Read the file line by line until there is no more text (null)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            // This catches errors if the file doesn't exist or can't be read
            System.err.println("An error occurred trying to open the file.");
            e.printStackTrace();
        }
    }
}
