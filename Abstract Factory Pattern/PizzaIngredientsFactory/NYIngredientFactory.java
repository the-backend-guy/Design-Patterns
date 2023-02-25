package PizzaIngredientsFactory;

import Cheese.Cheese;
import Cheese.Mozzarella;
import Dough.Dough;
import Dough.ThinCrust;

public class NYIngredientFactory implements IngredientsAbstractFactory{

    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }
    
}
