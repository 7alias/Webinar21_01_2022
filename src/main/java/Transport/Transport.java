package Transport;

public abstract class Transport {
    private boolean isEngineOn = false;
    abstract void go();
    void startEngine(){
        isEngineOn = true;
        System.out.println("Vehicle started");

    }

}
