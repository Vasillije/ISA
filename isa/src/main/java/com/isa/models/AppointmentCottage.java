package com.isa.models;


import java.util.Date;

public class AppointmentCottage extends Entity{
    private Date startDate;
    private Date endDate;
    private int maxNumberOfPersons;
    private double price;
    private AdditionalServiceCottage additionalServices;
    private boolean isAction;
    private double discount;

    public boolean isAction() {
        return isAction;
    }

    public void setAction(boolean action) {
        isAction = action;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getMaxNumberOfPersons() {
        return maxNumberOfPersons;
    }

    public void setMaxNumberOfPersons(int maxNumberOfPersons) {
        this.maxNumberOfPersons = maxNumberOfPersons;
    }

    public double getPrice() {
        return price;
    }

    public AdditionalServiceCottage getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(AdditionalServiceCottage additionalServices) {
        this.additionalServices = additionalServices;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
