package decorator.toppings.impl;

import decorator.base.BasePizza;
import decorator.toppings.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 20;
    }
}
