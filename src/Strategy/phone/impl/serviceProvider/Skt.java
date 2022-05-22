package Strategy.phone.impl.serviceProvider;

import Strategy.phone.interfaces.ServiceProvider;

public class Skt implements ServiceProvider {
    @Override
    public void serviceType() {
        System.out.println("Skt 5G");
    }
}
