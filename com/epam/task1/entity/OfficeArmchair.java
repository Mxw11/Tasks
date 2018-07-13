package com.epam.task1.entity;

import com.epam.task1.enums.OfficeArmchairType;

public class OfficeArmchair extends Chair {
    private OfficeArmchairType officeArmchairType;
    private double minHeight;
    private double maxHeight;
    private double minBackrestTiltAngle;
    private double maxBackrestTiltAngle;
    private boolean rotatable;

    public OfficeArmchairType getOfficeArmchairType() {
        return officeArmchairType;
    }

    public void setOfficeArmchairType(OfficeArmchairType officeArmchairType) {
        this.officeArmchairType = officeArmchairType;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMinBackrestTiltAngle() {
        return minBackrestTiltAngle;
    }

    public void setMinBackrestTiltAngle(double minBackrestTiltAngle) {
        this.minBackrestTiltAngle = minBackrestTiltAngle;
    }

    public double getMaxBackrestTiltAngle() {
        return maxBackrestTiltAngle;
    }

    public void setMaxBackrestTiltAngle(double maxBackrestTiltAngle) {
        this.maxBackrestTiltAngle = maxBackrestTiltAngle;
    }

    public boolean isRotatable() {
        return rotatable;
    }

    public void setRotatable(boolean rotatable) {
        this.rotatable = rotatable;
    }
}
