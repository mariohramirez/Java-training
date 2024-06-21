package com.training;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    //Podemos crear metodos static de igual forma
    static void displayFriends() {
        System.out.println("Tienes "+numberOfFriends+" amigos");
    }


}
