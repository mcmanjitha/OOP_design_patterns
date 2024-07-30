package pizza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Extra thick crust";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slice");
    }
}
