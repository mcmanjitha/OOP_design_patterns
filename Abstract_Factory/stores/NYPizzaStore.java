package stores;

import ingredientsFactory.NYPizzaIngredientsFactory;
import ingredientsFactory.PizzaIngredientsFactory;
import pizza.*;

public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("veggie")){
            return new VeggiePizza(ingredientsFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
