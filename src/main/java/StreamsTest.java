import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class StreamsTest {
    public static void main(String[] args) {
        String path = "https://randomuser.me/api/";
        try {
            URL url = new URL(path);
            InputStream inputStream = url.openStream();
            Reader inputStreamReader = new InputStreamReader(inputStream);
            char[] buffer = new char[1024];
                    while((inputStreamReader.read(buffer) >= 1)){
                                System.out.println(Arrays.toString(buffer));
                            }
            inputStreamReader.read();

        } catch (MalformedURLException e) {
            System.out.println("Error opening connection" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading data" + e.getMessage());
        }
    }

}
