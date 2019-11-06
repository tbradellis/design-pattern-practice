package com.bellis.headfirst.factory.ingredients;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new RedPepper(), new Onion(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepporoni() {
        return new SlicedPepporoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Brisket createBrisket() {
        return new BeefBrisket();
    }
}
