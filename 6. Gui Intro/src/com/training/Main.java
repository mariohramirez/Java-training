package com.training;

//Hacemos el importe a la libreria que nos dara los elementos graficos
import javax.swing.JOptionPane;

/*
*GUI es un acronimo de Graphis User Interface  (Interfaz grafica de usuario),
* Es un programa visual con el que podemos interactuar
*/

public class Main {

    public static void main(String [] args) {

        //Guardamos en la variable nombre lo que recibimos en la caja de input
        String name = JOptionPane.showInputDialog("Ingrese su nombre:");
        //Mostramos en una caja de dialogo un mensaje
        JOptionPane.showMessageDialog(null,"Hola: "+name);

        //Hacemos la conversion a Int, debido a que la caja de entrada solo recibe strings
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        JOptionPane.showMessageDialog(null, "Tu edad es de: "+age+" anos");

        //Hacemos la conversion a double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura: "));
        JOptionPane.showMessageDialog(null,"Su estatura es de: "+height+" metros");

    }
}
