package decorator.impl.Coffee;

import decorator.inter.Coffee.Beverage;

public abstract class Decorator extends Beverage {

    Beverage beverage;

    public abstract String getDesc();

}
