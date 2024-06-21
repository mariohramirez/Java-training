package com.code;

public class Car extends Vehicle{

    public Car(){
        super(4);
    }

    @Override
    public void go() {
        System.out.println("El carro ha arrancado");
    }
}
