package com.training;

public class Human {

    //Definimos los atributos
    private String name;
    private int age;
    private double weight;

    //Creamos el metodo constructo
    Human(String name, int age, double weight){
        //Usamos this para referirnos al atributo de la clase y le asignamos el name que llega en el constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(this.name+" esta comiendo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
