import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Yefa on 12/31/16.
 */
public class IO_library {
    public static void main(String[] args) {

        Path sf = Paths.get("file","file.txt");
        Path tf = Paths.get("file","IO.txt");

        try {
            Files.copy(sf,tf, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copy");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
