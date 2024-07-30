package flybehaviour;

import interfaces.FlyBehavior;

public class NoFly implements FlyBehavior {
    public void fly(){
        System.out.println("I'm not flying");
    }
}
