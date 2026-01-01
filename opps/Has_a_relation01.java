class Student{
    Brain b = new Brain(130, 1.4);
    Heart h = new Heart("Good", 1.2);
    void hasA(Bike bk){
        System.out.println(bk.getBrand());
        System.out.println(bk.getMillage());
    }

    void hasA(Book bk){
        System.out.println(bk.getSubject());
        System.out.println(bk.getPrice());
    }

    void printDetails(){
        System.out.println(b.getIq());
        System.out.println(b.getWeight());
        System.out.println(h.getHealth());
        System.out.println(h.getWeight());
    } 
}
class Bike{
    String brand;
    int millage;

    Bike(String brand, int millage){
        this.brand = brand;
        this.millage = millage;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getMillage(){
        return millage;
    }

    public void setMillage(int millage){
        this.millage = millage;
    }
}

class Book{
    String subject;
    int price;

    Book(String subject, int price){
        this.subject = subject;
        this.price = price;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public String getSubject(){
        return subject;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

class Brain{
    int iq;
    double weight;

    Brain(int iq, double weight){
        this.iq = iq;
        this.weight = weight;
    }   
    public void setIq(int iq){
        this.iq = iq;
    }
    public int getIq(){
        return iq;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
}

class Heart{
    String health;
    double weight;

    Heart(String health, double weight){
        this.health = health;
        this.weight = weight;
    }   
    public void setHealth(String health){
        this.health = health;
    }
    public String getHealth(){
        return health;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
}
public class Has_a_relation01 {
    public static void main(String[] args) {
        Student s = new Student();
        Bike b = new Bike("Honda", 60);
        Book bk = new Book("Java", 500);
        s.hasA(b);
        s.hasA(bk);
        System.out.println("============================");
        s.printDetails();
    }
}
