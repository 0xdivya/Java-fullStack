abstract class Trainer2{
    abstract void teach();
}

class JavaTrainer2 extends Trainer2{
    void teach(){
        System.out.println("teach JAVA");
    }

} 
class AptiTrainer2 extends Trainer2{
    void teach(){
        System.out.println("teach apti");
    }
}
class TestingTrainer2 extends Trainer2{
    void teach(){
        System.out.println("teach testing");
    }
}
public class Abstractio02 {
    public static void main(String[] args) {
        work(new AptiTrainer2());
        work(new JavaTrainer2());
        work(new TestingTrainer2());
    }

    static void work(Trainer2 t){
        t.teach();
    }
}
