package decorator.toppings.impl;

import decorator.base.BasePizza;
import decorator.toppings.ToppingDecorator;

public class Jalepino extends ToppingDecorator {
    BasePizza basePizza;

    public Jalepino(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 40;
    }
}
