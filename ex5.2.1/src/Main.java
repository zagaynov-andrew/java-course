import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        byte[] bytes = {123, 0, 13, 10, 10, 13 };
        ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
        System.setIn(byteStream);

        int prev = System.in.read();
        int next;
        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();
    }
}
