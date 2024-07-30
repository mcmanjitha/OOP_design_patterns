package pizza;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing"+dough+" dough");
        System.out.println("Adding "+sauce+" sauce");
        System.out.println("Adding toppings : ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    public void bake(){
        System.out.println("Bake for 25 minutes for 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Placing in boxes");
    }
    public String getName(){
        return name;
    }
}
