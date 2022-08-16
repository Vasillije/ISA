package com.isa.models;

public class ScheduledAppointmentFishingLesson extends Entity{
    public ScheduledAppointmentFishingLesson getScheduledAppointmentFishingLesson() {
        return scheduledAppointmentFishingLesson;
    }

    public void setScheduledAppointmentFishingLesson(ScheduledAppointmentFishingLesson scheduledAppointmentFishingLesson) {
        this.scheduledAppointmentFishingLesson = scheduledAppointmentFishingLesson;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private ScheduledAppointmentFishingLesson scheduledAppointmentFishingLesson;
    private User user;
    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
