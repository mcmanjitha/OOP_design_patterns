import bevarages.Bevarage;
import bevarages.Espresso;
import bevarages.HouseBlend;
import condiments.Mocha;
import condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Bevarage bevarage1 = new Espresso();
        System.out.println(bevarage1.getDescription() + "costs "+bevarage1.cost()+" $");

        Bevarage bevarage2 = new Mocha(new Espresso());
        System.out.println(bevarage2.getDescription() + "costs "+bevarage2.cost()+" $");

        Bevarage bevarage3 = new Mocha(new Mocha(new Espresso()));
        System.out.println(bevarage3.getDescription() + "costs "+bevarage3.cost()+" $");

        Bevarage bevarage4 = new Mocha(new Whip(new Espresso()));
        System.out.println(bevarage4.getDescription() + "costs "+bevarage4.cost()+" $");

    }
}
