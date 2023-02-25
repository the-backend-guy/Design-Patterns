package Store;

import Pizza.ChicagoStyleCheesePizza;
import Pizza.ChicagoStyleVeggiePizza;
import Pizza.Pizza;

public class ChicagoStore extends PizzaStore{

    @Override
    Pizza create(String type) {
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else if(type.equals("veg"))
            pizza = new ChicagoStyleVeggiePizza();  
        return pizza;
    }

    
    
}
