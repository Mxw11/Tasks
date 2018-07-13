package com.epam.task1.entity;

import com.epam.task1.enums.AttachmentType;
import com.epam.task1.enums.ShelfType;

public class Shelf extends StorageFurniture {
    private double surfaceArea;
    private ShelfType shelfType;
    private AttachmentType attachmentType;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public ShelfType getShelfType() {
        return shelfType;
    }

    public void setShelfType(ShelfType shelfType) {
        this.shelfType = shelfType;
    }

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
    }
}
