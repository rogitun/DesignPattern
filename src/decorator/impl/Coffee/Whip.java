package decorator.impl.Coffee;

import decorator.inter.Coffee.Beverage;

public class Whip extends Decorator {

    private final int PRICE = 300;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Whip";
    }

    @Override
    public int cost() {
        return beverage.cost() + PRICE;
    }
}
