package com.training;

//Creamos la clase de la cual van a heredar las otras clases
public class Vehicle {

    private double speed;

    public Vehicle(){
        this.speed = 0.0;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }


    void go(){
        System.out.println("El vehiculo esta en movimiento");
    }

    void stop() {
        System.out.println("Este vehiculo se ha detenido");
    }
}
