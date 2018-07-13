package com.epam.task1.entity;

import com.epam.task1.enums.DoorOpeningType;
import com.epam.task1.enums.WardrobeType;

public class Wardrobe extends StorageFurniture {
    private DoorOpeningType doorOpeningType;
    private int doorCount;
    private WardrobeType wardrobeType;

    public DoorOpeningType getDoorOpeningType() {
        return doorOpeningType;
    }

    public void setDoorOpeningType(DoorOpeningType doorOpeningType) {
        this.doorOpeningType = doorOpeningType;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public WardrobeType getWardrobeType() {
        return wardrobeType;
    }

    public void setWardrobeType(WardrobeType wardrobeType) {
        this.wardrobeType = wardrobeType;
    }
}
