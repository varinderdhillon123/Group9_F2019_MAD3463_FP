package com.lambton;

public class Car extends Vehicle
{

    private double distanceTravelled;
    private String capacity;
    public Car(String make, String color, String plate, Double distanceTravelled, String capacity) {
       
        this.distanceTravelled=distanceTravelled;
        this.capacity=capacity;

    }


    public Double getDistanceTravelled() {
        return distanceTravelled;
    }
    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
