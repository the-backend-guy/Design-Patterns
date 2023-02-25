package PizzaIngredientsFactory;

import Cheese.Cheese;
import Cheese.Reggiano;
import Dough.Dough;
import Dough.ThickCrust;

public class ChicagoIngredientFactory implements IngredientsAbstractFactory{

    @Override
    public Dough createDough() {
        return new ThickCrust();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }
    
}
