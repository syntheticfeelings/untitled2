package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.addCar(new Car("Lada", 1.8, CarType.HATCHBACK));
        car.addCar(new Car("Jigule", 2.2, CarType.LIMOUSINE));
        car.addCar(new Car("Opel", 3.0, CarType.COUPE));


        car.addCar(new Car("La2da", 1.8, CarType.HATCHBACK));
        car.addCar(new Car("Jig2ule", 2.2, CarType.LIMOUSINE));
        car.addCar(new Car("Opel33", 3.0, CarType.COUPE));


        System.out.println(car.getCars().toString());
        System.out.println(car.getCars(CarType.HATCHBACK));

    }
}
