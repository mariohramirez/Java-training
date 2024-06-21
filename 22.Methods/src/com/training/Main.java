package com.training;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String [] args) {

        //Method = Un bloque de codigo que se ejecuta cuando sea que es llamado

        //Hacemos el llamado a un metodo
        hello();

        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero x: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero y: "));

        //Hacemos el llamado a un metodo y le pasamos parametros
        int z = add(x,y);

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+z);

    }

    //Agregamos static al inicio, puesto que llamaremos al metodo desde un metodo estatico
    static void hello(){
        System.out.println("Hola");
    }

    //Es un metodo al que le pasamos datos por medio de los parametros entre ()
    static int add(int x, int y) {
        int z = x+y;
        return z;
    }



}
