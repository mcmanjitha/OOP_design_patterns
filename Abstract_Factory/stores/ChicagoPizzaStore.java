package stores;


import ingredientsFactory.NYPizzaIngredientsFactory;
import ingredientsFactory.PizzaIngredientsFactory;
import pizza.CheesePizza;
import pizza.Pizza;
import pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();
        if(type.equals("cheese")){
            return new CheesePizza(ingredientsFactory);
        }
        else if(type.equals("veggie")){
            return new VeggiePizza(ingredientsFactory);
        }else{
            return null;
        }
    }
}
