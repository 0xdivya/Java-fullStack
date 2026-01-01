import java.util.Scanner;

abstract class Shape{
     int area;
    abstract void findArea();
    abstract void displayArea();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    
    void findArea(){
        area = (int)(3.14*radius*radius);
    }
    void displayArea(){
        System.out.println("Area of Circle: "+area);
    }
}

class Triangle extends Shape{
    int base;
    int height;
    Triangle(int b, int h){
        base = b;
        height = h;
    }
    
    void findArea(){
        area = (base*height)/2;
    }
    void displayArea(){
        System.out.println("Area of Triangle: "+area);
    }
}
class Square extends Shape{
    int side;
    Square(int side){
        this.side = side;

    }
    void findArea(){
        area=side*side;
    }

    void displayArea(){
        System.out.println("Area of square : "+area);
    }
}
public class Calculator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Shape to calculate area:");
        System.out.println("1.To calculate circle enter Circle");
        System.out.println("2.To calculate triangle enter Triangle");
        System.out.println("3.To calculate square enter Square");
        String s = sc.nextLine();
        switch (s) {
            case "Circle":
                System.out.println("Calculating area of Circle");
                System.out.println("Enter radius:");
                int radius = sc.nextInt();
                calculateArea(new Circle(radius));
                break;
            case "Triangle":
                System.out.println("Calculating area of Triangle");
                System.out.println("Enter base and height:");
                int base = sc.nextInt();
                int height = sc.nextInt();
                calculateArea(new Triangle(base, height));
                break;
            case "Square":
                System.out.println("Calculating area of Square");
                System.out.println("Enter side:");
                int side = sc.nextInt();
                calculateArea(new Square(side));
                break;
            default:
                System.out.println("Invalid shape");
                break;
        }
        
    }
    static void calculateArea(Shape s){
        s.findArea();
        s.displayArea();
    }
}
