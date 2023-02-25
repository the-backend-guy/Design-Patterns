package PizzaIngredientsFactory;

import Cheese.Cheese;
import Dough.Dough;

public interface IngredientsAbstractFactory {

        public Dough createDough();
        public Cheese createCheese();
    
}
