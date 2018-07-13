package com.epam.task1.entity;

import com.epam.task1.enums.BaseType;
import com.epam.task1.enums.BedType;
import com.epam.task1.enums.ConstructionType;
import com.epam.task1.enums.SpaceCount;

public class Bed extends SitAndLieFurniture {
    private SpaceCount spaceCount;
    private BedType bedType;
    private ConstructionType constructionType;
    private double sleepingAreaLength;
    private BaseType baseType;
    private boolean headboard;
    private boolean footboard;

    public SpaceCount getSpaceCount() {
        return spaceCount;
    }

    public void setSpaceCount(SpaceCount spaceCount) {
        this.spaceCount = spaceCount;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public ConstructionType getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(ConstructionType constructionType) {
        this.constructionType = constructionType;
    }

    public double getSleepingAreaLength() {
        return sleepingAreaLength;
    }

    public void setSleepingAreaLength(double sleepingAreaLength) {
        this.sleepingAreaLength = sleepingAreaLength;
    }

    public BaseType getBaseType() {
        return baseType;
    }

    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }

    public boolean isHeadboard() {
        return headboard;
    }

    public void setHeadboard(boolean headboard) {
        this.headboard = headboard;
    }

    public boolean isFootboard() {
        return footboard;
    }

    public void setFootboard(boolean footboard) {
        this.footboard = footboard;
    }
}
