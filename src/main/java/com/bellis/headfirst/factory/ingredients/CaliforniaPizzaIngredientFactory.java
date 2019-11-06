package com.bellis.headfirst.factory.ingredients;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
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
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Onion(), new Spinach(), new Mushroom(), new Avacodo()};
        return  veggies ;
    }

    @Override
    public Pepperoni createPepporoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }

    @Override
    public Brisket createBrisket() {
        return new OrganicBeefBrisket();
    }
}
