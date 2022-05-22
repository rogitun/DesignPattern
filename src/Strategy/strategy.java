package Strategy;

import Strategy.phone.Phone;
import Strategy.phone.impl.battery.LgBattery;
import Strategy.phone.impl.battery.SamsungBattery;
import Strategy.phone.impl.os.Android;
import Strategy.phone.impl.os.Ios;
import Strategy.phone.impl.serviceProvider.Kt;
import Strategy.phone.impl.serviceProvider.Skt;

public class strategy {
    public static void main(String[] args) {
        Phone phone = new Phone(new Android(),new Kt(), new SamsungBattery());

        phone.powerOn();
        System.out.println("############");
        phone.setBattery(new LgBattery());
        System.out.println("############");
        phone.powerOff();
        System.out.println("############");
        phone.setOs(new Ios());
        phone.setServiceProvider(new Skt());
        phone.powerOn();
    }
}
