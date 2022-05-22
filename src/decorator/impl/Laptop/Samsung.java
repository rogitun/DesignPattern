package decorator.impl.Laptop;

import decorator.inter.Laptop.Laptop;

public class Samsung extends Laptop {

    public Samsung() {
        logo = "Samsung";
    }
    @Override
    public String spec() {
        return logo + " " + cpu;
    }
}
