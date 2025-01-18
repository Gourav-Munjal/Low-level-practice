package adapter;

import adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPounds() * 0.54;
    }
}
