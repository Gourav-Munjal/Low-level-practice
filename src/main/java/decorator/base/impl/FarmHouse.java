package decorator.base.impl;

import decorator.base.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public int getCost() {
        return 220;
    }
}
