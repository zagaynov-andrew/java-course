import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        // test
        byte[] buf = {0x33, 0x45, 0x01};

        try (ByteArrayInputStream arr = new ByteArrayInputStream(buf)) {
            System.out.println(Checksum.checksumOfStream(arr));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
