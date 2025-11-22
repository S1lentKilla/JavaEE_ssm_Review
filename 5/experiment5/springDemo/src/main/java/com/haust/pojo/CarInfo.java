package com.haust.pojo;

public class CarInfo extends Car{
    private String carName;

    public int calculatePrice(){
        return super.getPrice();
    };
    public CarInfo() {
    }

    public CarInfo(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
