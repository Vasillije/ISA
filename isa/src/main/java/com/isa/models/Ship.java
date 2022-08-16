package com.isa.models;

public class Ship extends Entity{
    private String name;
    private String address;
    private String description;
    private String pictureExterior;
    private String pictureInterior;
    private Room room;
    private int numberOfRooms;
    private String rulesOfConduct;
    private String priceList;
    private String additionalInformation;
    private AppointmentShip appointmentShip;

    public AppointmentShip getAppointmentShip() {
        return appointmentShip;
    }

    public void setAppointmentShip(AppointmentShip appointmentShip) {
        this.appointmentShip = appointmentShip;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
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

    public String getPictureExterior() {
        return pictureExterior;
    }

    public void setPictureExterior(String pictureExterior) {
        this.pictureExterior = pictureExterior;
    }

    public String getPictureInterior() {
        return pictureInterior;
    }

    public void setPictureInterior(String pictureInterior) {
        this.pictureInterior = pictureInterior;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getRulesOfConduct() {
        return rulesOfConduct;
    }

    public void setRulesOfConduct(String rulesOfConduct) {
        this.rulesOfConduct = rulesOfConduct;
    }

    public String getPriceList() {
        return priceList;
    }

    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
