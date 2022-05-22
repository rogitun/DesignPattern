package Strategy.phone.impl.os;

import Strategy.phone.interfaces.OperatingSystem;

public class Ios implements OperatingSystem {
    @Override
    public void showVersion() {
        System.out.println("IOS");
    }
}
