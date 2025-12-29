import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.Serializable;
class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Serialization01 {
    public static void main(String[] args) throws IOException , ClassNotFoundException  {
        FileOutputStream fos = new FileOutputStream("Info.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student("John", 20);
        oos.writeObject(s);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Info.ser"));
        Student s2 = (Student) ois.readObject();
        System.out.println("Name: " + s2.name + ", Age: " + s2.age);
        // ois.readObject();
        ois.close();
    }
}
