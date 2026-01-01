public class final01 {
    final int b = 20;
    // final int b; //it throws error because final variable must be initialized at the time of declaration or in constructor when it is instance variable
    public static void main(String[] args) {
        // b=10; // it throws error because final variable value cannot be changed
        final int a;
        a=30; // it is valid because local final variable can be initialized only once
        System.out.println(a);
    }
}
