class LaptopApp{
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Charger c = new Charger("Dell", 65);
        System.out.println(c.getBrand());
        l=null;
        l.hasA(c);
      
        System.gc(); 
    }
}

class Laptop{
    OS os = new OS("Windows", 10);
    void hasA(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getPower());

    }
}

class Charger{
    String brand;
    int power;

    Charger(String brand, int power){
        this.brand = brand;
        this.power = power;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
}

class OS{
    String brand;
    double version;
    public OS(String brand, double version){
        super();
        this.brand = brand;
        this.version = version;
    }
     public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public double getVersion(){
        return version;
    }
    public void setVersion(double version){
        this.version = version;
    }
}
