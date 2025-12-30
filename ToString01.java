class Students{
    int rollno;
    String name;

    Students(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    void display(){
        System.out.println("Roll No: "+rollno+" Name: "+name   );
    }
    public String toString(){
        // return "Roll No: "+rollno+" Name: "+name;
        String str="Roll No: "+rollno+" Name: "+name;
        return str;
    }
}
public class ToString01 {
    public static void main(String[] args) {
        Students s1=new Students(101, "Alice");
        Students s2=new Students(102, "Bob");
        System.out.println(s1);
        System.out.println(s2);
    }
}
