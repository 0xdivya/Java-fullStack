class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    Child() {
        // Implicit call to super()
        System.out.println("Child Constructor");
    }
}
public class constructor_chaining01 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
