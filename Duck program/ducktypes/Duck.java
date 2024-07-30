package ducktypes;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quakBehavior;

    public Duck(){

    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuak(){
        quakBehavior.quak();
    }
    public void swim(){
        System.out.println("I'm swimming");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuakBehavior(QuackBehavior qb){
        quakBehavior = qb;
    }

}
