package week9.moving.logic;

import week9.moving.domain.Box;
import week9.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box newBox = new Box(this.boxesVolume);
        for (Thing thing:things) {
            boolean added = newBox.addThing(thing);
            if(!added){
                boxes.add(newBox);
                newBox = new Box(this.boxesVolume);
                added = newBox.addThing(thing);
            }
        }
        boxes.add(newBox);
        return boxes;
    }
}