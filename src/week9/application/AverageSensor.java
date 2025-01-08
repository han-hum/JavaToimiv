package week9.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;
    private boolean isOn;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        for (Sensor sensor:this.sensors) {
            if(!sensor.isOn()){
                sensor.on();
            }
        }
        this.isOn = true;
    }

    @Override
    public void off() {
        for (Sensor sensor:this.sensors) {
            if(sensor.isOn()){
                sensor.off();
            }
        }
        this.isOn = false;
    }

    @Override
    public int measure() {
        if(this.isOn()){
            List<Integer> measurements = new ArrayList<Integer>();
            for (Sensor sensor:this.sensors) {
                int measurement = sensor.measure();
                measurements.add(measurement);
            }
            int sum = 0;
            for (Integer measurement:measurements) {
                sum += measurement;
            }
            int average = sum / measurements.size();
            this.readings.add(average);
            return average;
        } else {
            throw new IllegalStateException("All sensors have to be on for averageSensor to work");
        }
    }
    public List<Integer> readings(){
        return this.readings;
    }
}