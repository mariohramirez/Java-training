package com.training;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        this.setTitle("El titulo del this va aqui");//Asigna el titulo del marco
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Forma de salida de la aplicacion
        this.setResizable(false);//Previene que el marco tenga un tamano ajustable
        this.setSize(420,420);//Asigna las dimensiones en x y dimensiones en y de un marco
        this.setVisible(true);//Hace visible el marco

        ImageIcon image = new ImageIcon("Logo.png");//Crea una imagen de icono
        this.setIconImage(image.getImage());//Cambia el icono del marco
        this.getContentPane().setBackground(new Color(0x123456));//Cambia el color de fondo

    }

}
