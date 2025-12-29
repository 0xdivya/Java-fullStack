
class GrandParent {
    int a=10;
}
class Parent extends GrandParent {
    int b=20;
}
class child extends Parent {
    int c=30;
}
public class inheritance02_multilevel {
    public static void main(String[] args) {
        child obj=new child();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
