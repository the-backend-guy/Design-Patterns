package Store;

import Pizza.NYStyleCheesePizza;
import Pizza.Pizza;
import Pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza create(String type) {
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if(type.equals("veg"))
            pizza = new NYStyleVeggiePizza();  
            
        return pizza;
    }
    
}
