public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){
        System.out.println("singleton object created");
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
