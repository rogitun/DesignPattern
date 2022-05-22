package decorator.impl.Coffee;

import decorator.inter.Coffee.Beverage;

public class Milk extends Decorator{

    private final int PRICE = 500;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Milk";
    }

    @Override
    public int cost() {
        return PRICE + beverage.cost();
    }
}
