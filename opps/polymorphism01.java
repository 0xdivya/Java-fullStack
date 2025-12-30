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
public class polymorphism01 {
    public static void main(String[] args) {
        Trainer t;
        t = new JavaTrainer();
        t.teach();

        System.out.println("-------------------");

        t=new AptiTrainer();
        t.teach();

        System.out.println("-------------------");

        t=new TestingTrainer();
        t.teach();

    }
}
