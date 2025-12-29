import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment01_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
