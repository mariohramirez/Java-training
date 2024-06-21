package com.training;

public class Car {

    private String make;
    private String name;
    private int year;

    public Car(String make, String name, int year){
        this.make = make;
        this.name = name;
        this.year = year;
    }

    //Metodos set y get, los cuales nos permiten acceder a los atributos privados, para asginarles
    //nuevos valores u obtener los valores que tienen
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
