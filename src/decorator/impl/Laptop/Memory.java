package decorator.impl.Laptop;

import decorator.inter.Laptop.Laptop;
import decorator.inter.Laptop.LaptopDecorator;

public class Memory extends LaptopDecorator {

    private final String mem = "16GB";

    public Memory(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String spec() {
        return this.laptop.spec() + " + " + mem;
    }
}
