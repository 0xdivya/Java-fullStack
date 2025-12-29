class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "ID: "+id+" Name: "+name;
    }
}
public class ObjectClass {
    
public static void main(String[] args) {
    Student s1=new Student(101,"Alice");
    Student s2=new Student(101,"Alice");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.equals(s2));
}
    
}