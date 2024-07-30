package stores;


import pizza.ChicagoStyleCheesePizza;
import pizza.ChicagoStyleVeggiePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else{
            return null;
        }
    }
}
