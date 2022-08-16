package com.isa.models;

import com.isa.models.enums.NavigationEquipment;
import com.isa.models.enums.ReservationCancellationConditions;

public class Cottage extends Entity {
    private String name;
    private String type;
    private double length;
    private int numberOfEngines;
    private String powerOfEngine;
    private double maxSpeed;
    private NavigationEquipment navigationEquipment;
    private String address;
    private String description;
    private String pictureOfInterior;
    private String pictureOfExterior;
    private int capacity;
    private AppointmentCottage appointmentCottage;
    private String rulesOfConduct;
    private String fishingEquipment;
    private String priceList;
    private String additionalInformation;
    private ReservationCancellationConditions reservationCancellationConditions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(String powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public NavigationEquipment getNavigationEquipment() {
        return navigationEquipment;
    }

    public void setNavigationEquipment(NavigationEquipment navigationEquipment) {
        this.navigationEquipment = navigationEquipment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureOfInterior() {
        return pictureOfInterior;
    }

    public void setPictureOfInterior(String pictureOfInterior) {
        this.pictureOfInterior = pictureOfInterior;
    }

    public String getPictureOfExterior() {
        return pictureOfExterior;
    }

    public void setPictureOfExterior(String pictureOfExterior) {
        this.pictureOfExterior = pictureOfExterior;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public AppointmentCottage getAppointmentCottage() {
        return appointmentCottage;
    }

    public void setAppointmentCottage(AppointmentCottage appointmentCottage) {
        this.appointmentCottage = appointmentCottage;
    }

    public String getRulesOfConduct() {
        return rulesOfConduct;
    }

    public void setRulesOfConduct(String rulesOfConduct) {
        this.rulesOfConduct = rulesOfConduct;
    }

    public String getFishingEquipment() {
        return fishingEquipment;
    }

    public void setFishingEquipment(String fishingEquipment) {
        this.fishingEquipment = fishingEquipment;
    }

    public String getPriceList() {
        return priceList;
    }

    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public ReservationCancellationConditions getReservationCancellationConditions() {
        return reservationCancellationConditions;
    }

    public void setReservationCancellationConditions(ReservationCancellationConditions reservationCancellationConditions) {
        this.reservationCancellationConditions = reservationCancellationConditions;
    }
}
