import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Assignment02 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("F:\\java full stack\\Main Project\\images.jpeg");
        FileOutputStream fos = new FileOutputStream("F:\\java full stack\\Main Project\\copied_images.jpeg");
        int data;
        while ((data=fis.read())!=-1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
