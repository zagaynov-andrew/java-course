import java.io.IOException;
import java.io.InputStream;

public class Checksum {

    /**
     * Calculates the checksum of the byte stream.
     * @param inputStream The input stream from which bytes are read.
     * @return Checksum of the byte stream
     * @throws IOException Exception in case of byte reading error.
     */
    public static int checksumOfStream(InputStream inputStream) throws IOException {

        int checksum = 0;
        int read;

        while ((read = inputStream.read()) != -1)
            checksum = Integer.rotateLeft(checksum, 1) ^ read;
        return checksum;
    }

}
