
class charger{
    private String type;
    private int power;
    public charger(String type,int power){
        this.type=type;
        this.power=power;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public int getPower(){
        return power;
    }

    
}

class operatingSystem{
    private String name;
    private String version;

    public operatingSystem (String name, String version){
        this.name = name;
        this.version = version;
    }

    public void setVersion(String version){
        this.version = version;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }
    
}
public class LaptopApp {

	public static void main(String[] args) {
        

	}

}
