class Parent{
    int a;
    int b;
    public Parent(){
        this(99, 98); //constructor chaining within the same class
        a=10;
        b=20;
        System.out.println("zero parameterized  parent Constructor");
    }
    public Parent(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("two parameterized parent Constructor");
    }
}
class child extends Parent{
    
    public child(){
        a=30;
        b=40;
        System.out.println("zero parameterized child Constructor");
    }
    public child(int a, int b){
        this(); //constructor chaining within the same class
        this.a=a;
        this.b=b;
        System.out.println("two parameterized child Constructor");
    }
}
public class constructor03 {
    public static void main(String[] args) {
        child obj1=new child(100,99);
        System.out.println("a: "+obj1.a+" b: "+obj1.b);
    }
    
}
