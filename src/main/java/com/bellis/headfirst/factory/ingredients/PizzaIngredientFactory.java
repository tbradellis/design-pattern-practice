package com.bellis.headfirst.factory.ingredients;

public interface PizzaIngredientFactory {


    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepporoni();

    public Clams createClams();


    public Brisket createBrisket();
}
