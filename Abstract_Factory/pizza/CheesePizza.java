package pizza;

import ingredientsFactory.PizzaIngredientsFactory;
import ingredientsFactory.dough.ThinCrustDough;

public class CheesePizza extends Pizza{

    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }
    public void prepare(){
        System.out.println("Preparing "+name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();

    }
    public void cut(){
        System.out.println("Cutting the pizza into square slice");
    }
}
