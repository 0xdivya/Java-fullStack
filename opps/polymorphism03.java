class Tendulkar{
    void job(){
        System.out.println("play cricket");
    }
    void proffesion(){
        System.out.println("he is batsman");
    }
}

class ArjunTendulkar extends Tendulkar{
    
    void proffesion(){
        System.out.println("He is baller");
    }
    void smoke(){
        System.out.println("he smoke sometimes");
    }
}
public class polymorphism03 {
    public static void main(String[] args) {
        Tendulkar t = new ArjunTendulkar();
        t.job();
        t.proffesion();
        ((ArjunTendulkar)t).smoke();
    }
}
