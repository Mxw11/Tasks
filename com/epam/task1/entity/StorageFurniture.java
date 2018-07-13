package com.epam.task1.entity;

import com.epam.task1.enums.Shape;

public abstract class StorageFurniture extends Furniture {
    private Shape shape;
    private double capacityVolume;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getCapacityVolume() {
        return capacityVolume;
    }

    public void setCapacityVolume(double capacityVolume) {
        this.capacityVolume = capacityVolume;
    }
}
