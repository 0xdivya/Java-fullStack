class securityForce{
    void job(){
        System.out.println("Protect the country");
    }
     void protect(){
        System.out.println("protect in various ways");
    }
}

class army extends securityForce{
     void protect(){
        System.out.println("protect the country by land");
    }

    void useTank(){
        System.out.println("Army uses tanks");  
    }
}

class navy extends securityForce{
     void protect(){
        System.out.println("protect the country by sea");

    }
    void useShip(){
        System.out.println("Navy uses ships");
    }
}

class airforce extends securityForce{
     void protect(){
        System.out.println("protect the country by air");
    }
     void usePlane(){
        System.out.println("Airforce uses planes"); 
     }
}
public class inheretaince02 {
    public static void main(String[] args) {
        army a1=new army();
        a1.job();
        a1.protect();
        a1.useTank();
        System.out.println("-------------------");
        navy n1=new navy();
        n1.job();
        n1.protect();
        n1.useShip();
        System.out.println("-------------------");
        airforce af1=new airforce();
        af1.job();
        af1.protect();
        af1.usePlane();
    }
}
