package com.isa.models;

import com.isa.models.enums.Scale;

public class LoyaltyProgram extends Entity{
    private double numberOfPointsClient;
    private double numberOfPointsInstructor;
    private Scale scale;

    public double getNumberOfPointsClient() {
        return numberOfPointsClient;
    }

    public void setNumberOfPointsClient(double numberOfPointsClient) {
        this.numberOfPointsClient = numberOfPointsClient;
    }

    public double getNumberOfPointsInstructor() {
        return numberOfPointsInstructor;
    }

    public void setNumberOfPointsInstructor(double numberOfPointsInstructor) {
        this.numberOfPointsInstructor = numberOfPointsInstructor;
    }

    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }
}
