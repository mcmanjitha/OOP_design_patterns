package quackbehaviour;

import interfaces.QuackBehavior;

public class MuteQuak implements QuackBehavior {
    public void quak(){
        System.out.println("Not Quaking.....");
    }
}
