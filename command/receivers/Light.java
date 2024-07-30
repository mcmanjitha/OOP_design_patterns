package receivers;

public class Light {
    String name;
    public Light(String name){
        this.name = name;
    }
    public void On(){
        System.out.println("Light turned on");
    }

    public void Off(){
        System.out.println("Light turned off");
    }
}
