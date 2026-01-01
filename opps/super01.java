public class super01 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
class Parent{
    int x =10;
    void display(){
        System.out.println(x);
    }
}

class Child extends Parent{
    int x =20;
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }

    // void show(){
    //     display();
    //     super.display();
    //     System.out.println(super.x);
    // }
}
