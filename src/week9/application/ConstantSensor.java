package week9.application;

public class ConstantSensor implements Sensor {
    private int measuredValue;

    public ConstantSensor(int measuredValue) {
        this.measuredValue = measuredValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.measuredValue;
    }
}