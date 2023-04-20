package com.bridgelabz.hotelreservationsystem;

public class CustomerPreferences {
    private boolean rewards;
    private double weekdayCount;
    private double weekendCount;




    public CustomerPreferences() {
    }

    public CustomerPreferences(boolean rewards, double weekdayCount, double weekendCount) {
        this.rewards = rewards;
        this.weekdayCount = weekdayCount;
        this.weekendCount = weekendCount;
    }

    public boolean isRewards() {

        return rewards;
    }

    public double getWeekdayCount() {

        return weekdayCount;
    }
    public double  getWeekendCount(){

        return  weekendCount;
    }
}
