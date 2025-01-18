package decorator;

import decorator.base.BasePizza;
import decorator.base.impl.FarmDelight;
import decorator.toppings.impl.ExtraCheese;
import decorator.toppings.impl.Jalepino;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Jalepino(new ExtraCheese(new Jalepino(new FarmDelight())));
        System.out.println(pizza.getCost());
    }
}
