class Parent{
    int a;
    int b;
    public Parent(){
        a=10;
        b=20;
    }
    public Parent(int a, int b){
        this.a=a;
        this.b=b;
    }
}
class child extends Parent{
    
    public child(){
        a=30;
        b=40;
    }
    public child(int a, int b){
        
        this.a=a;
        this.b=b;
    }
}
public class constructor02 {
    public static void main(String[] args) {
        child obj1=new child();
        System.out.println("a: "+obj1.a+" b: "+obj1.b);
    }
    
}
