package Store;

import Pizza.CheesePizza;
import Pizza.Pizza;
import PizzaIngredientsFactory.IngredientsAbstractFactory;
import PizzaIngredientsFactory.NYIngredientFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza create(String type) {
        IngredientsAbstractFactory ingredientsAbstractFactory = new NYIngredientFactory();
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientsAbstractFactory);
            pizza.setName("---NY Style Cheese Pizza");
        }
        // else if(type.equals("veg")){
        //     pizza = new NYStyleVeggiePizza();  
        
        // }    
        return pizza;
    }
    
}
