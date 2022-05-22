package Strategy.phone.impl.battery;

import Strategy.phone.interfaces.Battery;

public class SamsungBattery implements Battery {
    @Override
    public void maxPower() {
        System.out.println("3200");
    }
}
