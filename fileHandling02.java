import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling02 {
    public static void main(String[] args) {

        try {
            // 1️⃣ File create + write
            FileOutputStream fos = new FileOutputStream("data.txt");
            fos.write(65);   // ASCII 65 = 'A'
            fos.close();

            // 2️⃣ File read
            FileInputStream fis = new FileInputStream("data.txt");
            int data;

            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
