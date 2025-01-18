package decorator.base.impl;

import decorator.base.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int getCost() {
        return 100;
    }
}
