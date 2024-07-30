import pizza.NYStyleVeggiePizza;
import pizza.Pizza;
import stores.ChicagoPizzaStore;
import stores.NYPizzaStore;
import stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Odered pizza is "+ pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Odered pizza is "+ pizza.getName() + "\n");

    }
}
