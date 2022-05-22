package decorator;

import decorator.impl.Coffee.Black;
import decorator.impl.Coffee.Milk;
import decorator.impl.Coffee.Whip;
import decorator.impl.Laptop.Camera;
import decorator.impl.Laptop.Memory;
import decorator.impl.Laptop.Samsung;
import decorator.impl.Laptop.Storage;
import decorator.inter.Coffee.Beverage;
import decorator.inter.Laptop.Laptop;

public class DecoratorMain {
    public static void main(String[] args) {
//        Beverage beverage = new Black();
//        System.out.println(beverage.getDesc() + " " + beverage.cost());
//
//        Beverage beverage2 = new Black();
//        beverage2 = new Milk(beverage2);// beverage2 = blackCoffee
//        beverage2 = new Whip(beverage2); // beverage2 = blackCoffee + Milk
//
//        System.out.println(beverage2.getDesc() + " " + beverage2.cost());
        
        
        Laptop laptop = new Samsung(); //깡통
        System.out.println(laptop.spec());

        Memory memory = new Memory(laptop); //메모리 추가
        System.out.println(memory.spec());

        Storage storage = new Storage(memory); //SSD 추가
        System.out.println(storage.spec());
//
//        Camera camera = new Camera(storage);
//        System.out.println(camera.spec());
//
//        Camera camera1 = new Camera(new Storage(new Memory(new Samsung())));
//        System.out.println(camera1.spec());

    }
}
