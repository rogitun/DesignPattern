package Strategy.phone.impl.os;

import Strategy.phone.interfaces.OperatingSystem;

public class Android implements OperatingSystem {

    @Override
    public void showVersion() {
        System.out.println("Android");
    }
}
