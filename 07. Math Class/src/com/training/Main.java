package com.training;

import  javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        //Encuentra el numero mas grande entre dos numeros
        double z = Math.max(x,y);

        System.out.println(z);

        //Encuentra el valor minimo entre dos numeros
        double minimun = Math.min(x,y);

        System.out.println(minimun);

        //Encuentra el valor absoluto de y
        double absolute = Math.abs(y);

        System.out.println(absolute);

        //Encuentra la raiz cuadrada de un numero

        double square = Math.sqrt(absolute);

        System.out.println(square);

        //Redondea un numero

        double rounded = Math.round(x);

        System.out.println(rounded);

        //Redondea el numero hacia arriba

        double ceilin = Math.ceil(x);

        System.out.println(ceilin);

        //Encontrar la hiptenusa de un triangulos
        double co = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto opuesto de la hipotenusa: "));
        double ca = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto adyacente de la hipotenusa:"));

        //Math.pow eleva el numero al segundo argumento ingresado en la funcion
        double hipotenusa = Math.sqrt(Math.pow(co,2) + Math.pow(ca,2));

        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es: "+hipotenusa);
    }

}
