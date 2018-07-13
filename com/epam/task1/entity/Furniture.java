package com.epam.task1.entity;

import com.epam.task1.enums.*;

public abstract class Furniture {
    private int id;
    private String name;
    private double cost;
    private double width;
    private double height;
    private double depth;
    private FrameMaterial frameMaterial;
    private Stylistics stylistics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public FrameMaterial getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(FrameMaterial frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public Stylistics getStylistics() {
        return stylistics;
    }

    public void setStylistics(Stylistics stylistics) {
        this.stylistics = stylistics;
    }
}
