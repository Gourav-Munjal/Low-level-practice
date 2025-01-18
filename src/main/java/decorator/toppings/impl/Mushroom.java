package decorator.toppings.impl;

import decorator.base.BasePizza;
import decorator.toppings.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 30;
    }
}
