package com.epam.task1.entity;

public abstract class Chair extends SitAndLieFurniture {
    private double backrestTiltAngle;
    private double backrestHeight;
    private double seatDepth;

    public double getBackrestTiltAngle() {
        return backrestTiltAngle;
    }

    public void setBackrestTiltAngle(double backrestTiltAngle) {
        this.backrestTiltAngle = backrestTiltAngle;
    }

    public double getBackrestHeight() {
        return backrestHeight;
    }

    public void setBackrestHeight(double backrestHeight) {
        this.backrestHeight = backrestHeight;
    }

    public double getSeatDepth() {
        return seatDepth;
    }

    public void setSeatDepth(double seatDepth) {
        this.seatDepth = seatDepth;
    }
}
