package ingredientsFactory;

import ingredientsFactory.cheese.Cheese;
import ingredientsFactory.dough.Dough;
import ingredientsFactory.sauce.Sauce;

public interface PizzaIngredientsFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
