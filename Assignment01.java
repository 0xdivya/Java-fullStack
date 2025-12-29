import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class Assignment01 {
    public static void main(String[] args) throws IOException{
        File f = new File("student.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
        bw.write("ID: " + 101 + ", Name: " + "Divya" + ", Marks: " + 95);
        bw.newLine();
        bw.write("ID: " + 102 + ", Name: " + "Surbhi" + ", Marks: " + 98);
        bw.newLine();
        bw.write("ID: " + 103 + ", Name: " + "Riya" + ", Marks: " + 87);
        bw.close();
    } 
}
