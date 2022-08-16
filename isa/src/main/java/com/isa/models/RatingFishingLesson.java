package com.isa.models;

public class RatingFishingLesson extends Entity{
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public FishingLessons getFishingLessons() {
        return fishingLessons;
    }

    public void setFishingLessons(FishingLessons fishingLessons) {
        this.fishingLessons = fishingLessons;
    }

    private FishingLessons fishingLessons;
}
