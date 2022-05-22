package Strategy.phone.impl.serviceProvider;

import Strategy.phone.interfaces.ServiceProvider;

public class Kt implements ServiceProvider {
    @Override
    public void serviceType() {
        System.out.println("KT LTE");
    }
}
