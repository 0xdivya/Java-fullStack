
abstract class SecurityForce1{
   

    abstract void protect1();
    
}

class Army1 extends SecurityForce1{
    void protect1(){
        System.out.println("protect the land");
    }

    void weapon1(){
        System.out.println("use tank");
    }
}
class Navy1 extends SecurityForce1{
    void protect1(){
        System.out.println("protect the water ways");
    }

    void weapon1(){
        System.out.println("use ship");
    }
}
class AirForce1 extends SecurityForce1{
    void protect1(){
        System.out.println("protect the air ways");
    }

    void weapon1(){
        System.out.println("use jets");
    }
}
public class Abstraction01 {
    public static void main(String[] args) {
        force1(new AirForce1());
        force1(new Army1());
        force1(new Navy1());
        
    }  
    static void force1(SecurityForce1 sf){
       
        sf.protect1();
       
    }  
}
