package ducktypes;

import flybehaviour.NoFly;
import quackbehaviour.DuckQuacking;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.setQuakBehavior(new DuckQuacking());
        this.setFlyBehavior(new NoFly());
    }
    public void display(){
        System.out.println("I'm a ducktypes.MallardDuck");
    }
}
