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
        calculateArea(new Circle(7));
        calculateArea(new Triangle(5, 10));
        calculateArea(new Square(5));
    }
    static void calculateArea(Shape s){
        s.findArea();
        s.displayArea();
    }
}
