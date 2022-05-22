package decorator.impl.Laptop;

import decorator.inter.Laptop.Laptop;
import decorator.inter.Laptop.LaptopDecorator;

public class Camera extends LaptopDecorator {

    private final String cam = "4800MP";

    public Camera(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String spec() {
        return laptop.spec() + " With " + cam;
    }
}
