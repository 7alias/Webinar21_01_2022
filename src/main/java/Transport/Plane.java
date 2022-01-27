package Transport;

public class Plane extends Transport {
    @Override
    void go() {
        System.out.println("Flying");
    }

    void startEngine(int time) {
        //super.startEngine();
        System.out.println("Plane");
    }
}

