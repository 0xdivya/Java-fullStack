class SecurityForce1{
    void job1(){
        System.out.println("Save nation");
    }

    void protect1(){
        System.out.println("protect ways");
    }
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
public class polymorphism04 {
    public static void main(String[] args) {
        force1(new AirForce1());
        force1(new Army1());
        force1(new Navy1());
        
    }  
    static void force1(SecurityForce1 sf){
        sf.job1();
        sf.protect1();
        // ((Army1)sf).weapon1();
        // ((Navy1)sf).weapon1();
        // ((AirForce1)sf).weapon1();
    }  
}
