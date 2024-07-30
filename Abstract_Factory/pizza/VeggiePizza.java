package pizza;

import ingredientsFactory.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;
    public VeggiePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }
    public void prepare(){
        System.out.println("Preparing "+name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();

    }
}
