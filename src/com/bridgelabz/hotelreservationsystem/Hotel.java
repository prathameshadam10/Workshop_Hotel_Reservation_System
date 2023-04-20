package com.bridgelabz.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class Hotel {
    private  String hotelName;
   private int rating;
   private double weekdayRegularCustomerCost;
   private double weekdayRewardsCustomerCost;
   private double weekendRegularCustomerCost;
   private double weekendRewardsCustomerCost;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating, double weekdayRegularCustomerCost, double weekdayRewardsCustomerCost, double weekendRegularCustomerCost, double weekendRewardsCustomerCost) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        this.weekdayRewardsCustomerCost = weekdayRewardsCustomerCost;
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
        this.weekendRewardsCustomerCost = weekendRewardsCustomerCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getWeekdayRegularCustomerCost() {
        return weekdayRegularCustomerCost;
    }

    public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
    }

    public double getWeekdayRewardsCustomerCost() {
        return weekdayRewardsCustomerCost;
    }

    public void setWeekdayRewardsCustomerCost(double weekdayRewardsCustomerCost) {
        this.weekdayRewardsCustomerCost = weekdayRewardsCustomerCost;
    }

    public double getWeekendRegularCustomerCost() {
        return weekendRegularCustomerCost;
    }

    public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

    public double getWeekendRewardsCustomerCost() {
        return weekendRewardsCustomerCost;
    }

    public void setWeekendRewardsCustomerCost(double weekendRewardsCustomerCost) {
        this.weekendRewardsCustomerCost = weekendRewardsCustomerCost;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + rating +
                ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost +
                ", weekdayRewardsCustomerCost=" + weekdayRewardsCustomerCost +
                ", WeekendRegularCustomerCost=" + weekendRegularCustomerCost +
                ", weekendRewardsCustomerCost=" + weekendRewardsCustomerCost +
                '}';
    }

    public double getCost(CustomerPreferences customerPreferences) {
        double weekdayRate = customerPreferences.isRewards() ? weekdayRewardsCustomerCost: weekdayRegularCustomerCost;
        double weekendRate = customerPreferences.isRewards() ? weekendRewardsCustomerCost: weekendRegularCustomerCost;

        double totalCost = customerPreferences.getWeekdayCount() * weekdayRate + customerPreferences.getWeekendCount() * weekendRate;
        return totalCost;
    }
//    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate){
//        Calendar startCal = Calendar.getInstance();
//        startCal.setTime(startDate);
//        Calendar endCal = Calender.getInstance();
//        endCal.setTime(endDate);
//        int workingDays = 0;
//
//        if(startCal.getTimeInMillis() == endCal.getTimeInMillis()){
//            return  0;
//        }
//        if(startCal.getTimeInMillis() > endCal.getTimeInMillis()){
//            startCal.setTime(endDate);
//            endCal.setTime(startDate);
//        }
//        do {
//            startCal.add(Calender.Day_OF_WEEk) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK)
//        }
//
//    }


}
//    LocalDate date1 = LocalDate.of(year,month,day);
//    DayOfWeek dayOfWeek = date1.getDayOfWeek();
//    int dayofWeekValue = dayOfWeek.getValue();// 1 for monday 2 for tuesday ......
//        return dayofWeekValue;
//                LocalDate date1 = LocalDate.of(year,month,day);
//                DayOfWeek dayOfWeek = date1.getDayOfWeek();
//                int dayofWeekValue = dayOfWeek.getValue();// 1 for monday 2 for tuesday ......
//                return dayofWeekValue;