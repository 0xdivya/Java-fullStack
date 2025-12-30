import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling02 {
    public static void main(String[] args) {

        try {
            
            FileOutputStream fos = new FileOutputStream("data.txt");
            fos.write(65);   
            fos.close();

           
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
