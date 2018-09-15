package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private double count;

    private CarType carType;

    public Car() {
    }

    public Car(String name, double count, CarType carType) {
        this.name = name;
        this.count = count;
        this.carType = carType;
    }

    private ArrayList<Car> cars = new ArrayList<>();

    public List<Car> addCar(Car e){
        cars.add(e);
        return cars;
    }


    public String getCars(CarType t){
        for(Car car:cars){
            if(t.equals(car.carType)){
                return car.toString();
            }
        }
        return null;
    }


    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", carType=" + carType +
                '}';
    }
}
