package com.isa.models;

import com.isa.models.enums.ReservationCancellationConditions;

public class FishingLessons extends Entity{
    private String name;
    private String address;
    private String description;
    private String instructorBiography;
    private PictureOfPreviousGatherings pictureOfPreviousGatherings;
    private int maxNumberOfPersons;
    private AppointmentFishingLesson appointmentFishingLesson;
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

    public String getInstructorBiography() {
        return instructorBiography;
    }

    public void setInstructorBiography(String instructorBiography) {
        this.instructorBiography = instructorBiography;
    }

    public PictureOfPreviousGatherings getPictureOfPreviousGatherings() {
        return pictureOfPreviousGatherings;
    }

    public void setPictureOfPreviousGatherings(PictureOfPreviousGatherings pictureOfPreviousGatherings) {
        this.pictureOfPreviousGatherings = pictureOfPreviousGatherings;
    }

    public int getMaxNumberOfPersons() {
        return maxNumberOfPersons;
    }

    public void setMaxNumberOfPersons(int maxNumberOfPersons) {
        this.maxNumberOfPersons = maxNumberOfPersons;
    }

    public AppointmentFishingLesson getAppointmentFishingLesson() {
        return appointmentFishingLesson;
    }

    public void setAppointmentFishingLesson(AppointmentFishingLesson appointmentFishingLesson) {
        this.appointmentFishingLesson = appointmentFishingLesson;
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
