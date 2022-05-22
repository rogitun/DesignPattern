package decorator.inter.Coffee;

public abstract class Beverage {
    protected String desc = "water";

    public String getDesc(){
        return desc;
    }
    public abstract int cost();
}
