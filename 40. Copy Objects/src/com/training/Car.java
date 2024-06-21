package com.training;

public class Car {

    private String make;
    private String name;
    private int year;

    public Car(String make, String name, int year){
        this.make = make;
        this.year = year;
        this.name = name;
    }

    //Metodo que hace la copia del objeto
    public void copy(Car car){
        this.setMake(car.getMake());
        this.setYear(car.getYear());
        this.setName(car.getName());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
