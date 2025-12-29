class Parent{
    int a=10;
    int b=20;
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
class child extends Parent{
    
}
public class inheritance01 {
    public static void main(String[] args) {
        child obj=new child();
        //property of parent class
        System.out.println(obj.a);
        //behavior of parent class
        obj.display();
        
    }
}
