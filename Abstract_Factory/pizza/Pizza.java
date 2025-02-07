package pizza;

import ingredientsFactory.cheese.Cheese;
import ingredientsFactory.dough.Dough;
import ingredientsFactory.sauce.Sauce;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    //ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();
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
    public void setName(String name){
        this.name = name;
    }
}
