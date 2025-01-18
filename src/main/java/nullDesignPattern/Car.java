package nullDesignPattern;

public class Car implements Vehicle {
    @Override
    public int getFuelCap() {
        return 15;
    }

    @Override
    public int getSeatCap() {
        return 5;
    }
}
