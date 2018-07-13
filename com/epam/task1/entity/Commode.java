package com.epam.task1.entity;

import com.epam.task1.enums.CommodeType;

public class Commode extends StorageFurniture {
    private int lockerCount;
    private double lockerWidth;
    private double lockerHeight;
    private double lockerDepth;
    private CommodeType commodeType;

    public int getLockerCount() {
        return lockerCount;
    }

    public void setLockerCount(int lockerCount) {
        this.lockerCount = lockerCount;
    }

    public double getLockerWidth() {
        return lockerWidth;
    }

    public void setLockerWidth(double lockerWidth) {
        this.lockerWidth = lockerWidth;
    }

    public double getLockerHeight() {
        return lockerHeight;
    }

    public void setLockerHeight(double lockerHeight) {
        this.lockerHeight = lockerHeight;
    }

    public double getLockerDepth() {
        return lockerDepth;
    }

    public void setLockerDepth(double lockerDepth) {
        this.lockerDepth = lockerDepth;
    }

    public CommodeType getCommodeType() {
        return commodeType;
    }

    public void setCommodeType(CommodeType commodeType) {
        this.commodeType = commodeType;
    }
}
