import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        // test
        byte[] buf = "ПРИВЕТ".getBytes(StandardCharsets.UTF_8);

        try (ByteArrayInputStream arr = new ByteArrayInputStream(buf)) {
            System.out.println(readAsString(arr, StandardCharsets.UTF_8));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int data;

        while ((data = reader.read()) != -1) {
            sb.append((char) data);
        }
        return sb.toString();
    }
}
