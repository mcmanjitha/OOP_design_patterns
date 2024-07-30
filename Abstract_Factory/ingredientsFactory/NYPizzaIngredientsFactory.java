package ingredientsFactory;

import ingredientsFactory.cheese.Cheese;
import ingredientsFactory.cheese.ReggianoCheese;
import ingredientsFactory.dough.Dough;
import ingredientsFactory.dough.ThinCrustDough;
import ingredientsFactory.sauce.MarinaraSauce;
import ingredientsFactory.sauce.Sauce;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
