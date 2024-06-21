package com.training;

public class Main {

    public static void main(String [] args) {
        //Static = modificador. Una sola copia de una variable/metodo es crada y compartida.
        //La case es propietaria del miembro estatico

        //Al irlos creando se va sumando el numero de amigos
        //COmo es una variable estatica todos la comparten
        Friend friend1 = new Friend("Andres");
        Friend friend2 = new Friend("Andres");
        Friend friend3 = new Friend("Andres");

        //Nos daria un error si no fuera estatica
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();

    }

}
