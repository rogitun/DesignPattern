package decorator.impl.Coffee;

import decorator.inter.Coffee.Beverage;

public class Black extends Beverage {

    private final int PRICE = 2500;

    public Black(){
        desc = "BlackCoffee";
    }

    @Override
    public int cost() {
        return PRICE;
    }
}
