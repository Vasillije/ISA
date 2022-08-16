package com.isa.models;

public class ScheduledAppointmentCottage extends Entity{
    private ScheduledAppointmentCottage scheduledAppointmentCottage;
    private User user;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private boolean deleted;
    public ScheduledAppointmentCottage getScheduledAppointmentCottage() {
        return scheduledAppointmentCottage;
    }

    public void setScheduledAppointmentCottage(ScheduledAppointmentCottage scheduledAppointmentCottage) {
        this.scheduledAppointmentCottage = scheduledAppointmentCottage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
