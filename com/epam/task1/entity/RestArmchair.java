package com.epam.task1.entity;

import com.epam.task1.enums.Filler;
import com.epam.task1.enums.RestArmchairType;

public class RestArmchair extends Chair {
    private RestArmchairType restArmchairType;
    private Filler filler;
    private boolean armrests;

    public RestArmchairType getRestArmchairType() {
        return restArmchairType;
    }

    public void setRestArmchairType(RestArmchairType restArmchairType) {
        this.restArmchairType = restArmchairType;
    }

    public Filler getFiller() {
        return filler;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }

    public boolean isArmrests() {
        return armrests;
    }

    public void setArmrests(boolean armrests) {
        this.armrests = armrests;
    }
}
