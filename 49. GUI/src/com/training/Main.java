package com.training;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        // JFrame = Una ventana de la interfaz grafica de usuario(GUI - Graphics User Interface) a la que se le pueden agregar componentes

        JFrame frame = new JFrame();//Crea un marco
        frame.setTitle("El titulo del frame va aqui");//Asigna el titulo del marco
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Forma de salida de la aplicacion
        frame.setResizable(false);//Previene que el marco tenga un tamano ajustable
        frame.setSize(420,420);//Asigna las dimensiones en x y dimensiones en y de un marco
        frame.setVisible(true);//Hace visible el marco

        ImageIcon image = new ImageIcon("Logo.png");//Crea una imagen de icono
        frame.setIconImage(image.getImage());//Cambia el icono del marco
        frame.getContentPane().setBackground(new Color(0x123456));//Cambia el color de fondo

        //Podemos crear una clase que extiende de JFrame y usarla para crear el Frame
        //MyFrame myFrame = new MyFrame();
    }

}
