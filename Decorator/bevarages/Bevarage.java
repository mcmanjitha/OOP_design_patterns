package bevarages;

public abstract class Bevarage {
    String description = "unknown bevarage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
