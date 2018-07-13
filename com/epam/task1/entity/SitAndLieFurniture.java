package com.epam.task1.entity;

import com.epam.task1.enums.UpholsteryMaterial;

public abstract class SitAndLieFurniture extends Furniture {
    private double surfaceArea;
    private double fromFloorToSurfaceHeight;
    private UpholsteryMaterial upholsteryMaterial;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getFromFloorToSurfaceHeight() {
        return fromFloorToSurfaceHeight;
    }

    public void setFromFloorToSurfaceHeight(double fromFloorToSurfaceHeight) {
        this.fromFloorToSurfaceHeight = fromFloorToSurfaceHeight;
    }

    public UpholsteryMaterial getUpholsteryMaterial() {
        return upholsteryMaterial;
    }

    public void setUpholsteryMaterial(UpholsteryMaterial upholsteryMaterial) {
        this.upholsteryMaterial = upholsteryMaterial;
    }
}
