class Parent{
    Animal display(){
        Animal a = new Animal();
        return a;
    }
}
class child extends Parent{
    Dog display(){
        Dog d = new Dog();
        return d;
    }
}

class Animal{
    String show(String s){
        return "hello " + s;
    }
}
class Dog extends Animal{
    String show(String s){
        return "bark " + s;
    }
}
public class inheritance03 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Animal a = p.display();
        System.out.println(a.show("world"));
        child c = new child();
        Dog d = c.display();
        System.out.println(d.show("DOG"));

    }
}
