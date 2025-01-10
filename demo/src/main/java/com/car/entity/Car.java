package com.car.entity;

import java.util.*;
public class Car {
    private long CarId;
    private String CarModel;
    private String CarColor;
    private String CarReleaseYear;
    private String CarImage;

    
    public Car() {
    }

    public Car(long carId, String carModel, String carColor, String carReleaseYear, String carImage) {
        CarId = carId;
        CarModel = carModel;
        CarColor = carColor;
        CarReleaseYear = carReleaseYear;
        CarImage = carImage;
    }

    public long getCarId() {
        return CarId;
    }

    public void setCarId(long carId) {
        CarId = carId;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarReleaseYear() {
        return CarReleaseYear;
    }

    public void setCarReleaseYear(String carReleaseYear) {
        CarReleaseYear = carReleaseYear;
    }

    public String getCarImage() {
        return CarImage;
    }

    public void setCarImage(String carImage) {
        CarImage = carImage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + CarId +
                ", CarModel='" + CarModel + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarReleaseYear='" + CarReleaseYear + '\'' +
                ", CarImage='" + CarImage + '\'' +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return CarId == car.CarId &&
                CarModel.equals(car.CarModel) &&
                CarColor.equals(car.CarColor) &&
                CarReleaseYear.equals(car.CarReleaseYear) &&
                CarImage.equals(car.CarImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CarId, CarModel, CarColor, CarReleaseYear, CarImage);
    }
}
