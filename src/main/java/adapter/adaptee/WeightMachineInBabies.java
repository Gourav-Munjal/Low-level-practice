package adapter.adaptee;

public class WeightMachineInBabies implements WeightMachine {
    double weight;

    public WeightMachineInBabies(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeightInPounds() {
        return weight;
    }
}
