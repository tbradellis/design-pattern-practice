package com.bellis.headfirst.factory.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {



    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepporoni() {
        return new SlicedPepporoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Brisket createBrisket() { return new BeefBrisket(); }
}
