class Trainer{
    void teach(){
        System.out.println("Teaching");
    }
}

class JavaTrainer extends Trainer{
    void teach(){
        System.out.println("Teaching Java");
    }
}

class AptiTrainer extends Trainer{
    void teach(){
        System.out.println("Teaching Aptitude");
    }
}

class TestingTrainer extends Trainer{
    void teach(){
        System.out.println("Teaching Testing");
    }
}
public class polymorphism02 {
    public static void main(String[] args) {
        duty(new JavaTrainer());
        duty(new AptiTrainer());
        duty(new TestingTrainer());
    }
    static void duty(Trainer t){
        t.teach();
    }
}
