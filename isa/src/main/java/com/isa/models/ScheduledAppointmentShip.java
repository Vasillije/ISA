package com.isa.models;

import java.util.Date;

public class ScheduledAppointmentShip extends Entity{
    private AppointmentShip appointmentShip;
    private User user;
    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public AppointmentShip getAppointmentShip() {
        return appointmentShip;
    }

    public void setAppointmentShip(AppointmentShip appointmentShip) {
        this.appointmentShip = appointmentShip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
