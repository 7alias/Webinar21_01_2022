package Transport;

import Transport.Transport;

public class Car extends Transport {
    @Override
    void go()
    {
        System.out.println("Driving");
    }
    void startEngine(int time){
        super.startEngine();
        System.out.println("Vehicle is car");

    }
}
