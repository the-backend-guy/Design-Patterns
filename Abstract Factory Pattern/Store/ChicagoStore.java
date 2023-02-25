package Store;

import Cheese.Cheese;
import Pizza.CheesePizza;
import Pizza.Pizza;
import PizzaIngredientsFactory.ChicagoIngredientFactory;
import PizzaIngredientsFactory.IngredientsAbstractFactory;

public class ChicagoStore extends PizzaStore{

    @Override
    Pizza create(String type) {
        IngredientsAbstractFactory ingredientsAbstractFactory = new ChicagoIngredientFactory();
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new CheesePizza(ingredientsAbstractFactory); 
        return pizza;
    }

    
    
}
