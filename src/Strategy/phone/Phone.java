package Strategy.phone;

import Strategy.phone.interfaces.Battery;
import Strategy.phone.interfaces.OperatingSystem;
import Strategy.phone.interfaces.ServiceProvider;

public class Phone {

    private OperatingSystem os;
    private ServiceProvider serviceProvider;
    private Battery battery;
    private boolean running;

    public Phone(OperatingSystem os, ServiceProvider serviceProvider, Battery battery) {
        this.os = os;
        this.serviceProvider = serviceProvider;
        this.battery = battery;
    }

    public void powerOn() {
        if (!running) {
            os.showVersion();
            serviceProvider.serviceType();
            battery.maxPower();
            running = true;
        }
    }

    public void powerOff() {
        running = false;
        System.out.println("Power-Off");
    }


    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setBattery(Battery battery) {
        if (running) {
            System.out.println("전원을 끄고 수행해주세요.");
            return;
        }
        this.battery = battery;
    }
}
