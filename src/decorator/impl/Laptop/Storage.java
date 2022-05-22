package decorator.impl.Laptop;

import decorator.inter.Laptop.Laptop;
import decorator.inter.Laptop.LaptopDecorator;

public class Storage extends LaptopDecorator {

    private final String storage = "512GB";

    public Storage(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String spec() {
        return laptop.spec() + " + " + storage;
    }
}
