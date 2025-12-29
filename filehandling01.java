import java.io.File;
import java.io.IOException;
public class filehandling01 {
    
    public static void main(String[] args) {
        try{

            File f1 = new File("testfile.txt");
            f1.createNewFile();
            System.out.println(f1.exists());
            File f2 = new File("Main Project");
            f2.mkdir();
            File f3 = new File("Main Project","testfile.txt");
            f3.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
