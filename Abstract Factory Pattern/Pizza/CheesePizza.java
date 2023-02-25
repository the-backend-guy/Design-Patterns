package Pizza;

import PizzaIngredientsFactory.IngredientsAbstractFactory;

public class CheesePizza extends Pizza{
    
    IngredientsAbstractFactory ingredientsAbstractFactory;

    public CheesePizza(IngredientsAbstractFactory ingredientsAbstractFactory){
        this.ingredientsAbstractFactory = ingredientsAbstractFactory;
    }

    public void prepare(){
        System.out.println("----####Preparing " + name + " using Ingredient Factory");
        dough = ingredientsAbstractFactory.createDough();
        cheese = ingredientsAbstractFactory.createCheese();
    }

}
