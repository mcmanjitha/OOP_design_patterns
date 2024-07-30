package condiments;

import bevarages.Bevarage;

public class Mocha extends CondimentDecorator {
    Bevarage bevarage;

    public Mocha(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    public String getDescription(){
        return bevarage.getDescription() + "Mocha ";
    }
    public double cost(){
        return bevarage.cost() + 0.2;
    }

}
