package nullDesignPattern;

public class NULL implements Vehicle {
    @Override
    public int getFuelCap() {
        return 0;
    }

    @Override
    public int getSeatCap() {
        return 0;
    }
}
