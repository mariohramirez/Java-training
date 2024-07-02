package com.training;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        //JLabel = un area desplegable GUI para un string de texto, una imagen o ambos

        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();//Crea un Label
        label.setText("Codificas");//Asigna un texto al label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//Asigna el texto a la izquierda, centro, derecha de un imageIcon
        label.setVerticalTextPosition(JLabel.TOP);//Asigna el arribba, al centro o abajo de un imageIcon
        label.setForeground(new Color(0x00FF00));//Asigna el color de la fuente del texto
        label.setIconTextGap(-25);//Asigna un espacio entre el texto y la imagen
        label.setBackground(Color.blue);//Asigna un color de fondo
        label.setFont(new Font("MV Boli", Font.PLAIN,20));//Asigna la fuente al texto
        label.setOpaque(true);//Muestra un color de fondo
        label.setBorder(border);//Asigna un borde al label (No la imagen+texto)
        label.setVerticalAlignment(JLabel.CENTER);//Asigna la posicion del icono+texto dentro del label verticalmente
        label.setHorizontalAlignment(JLabel.CENTER);//Asigna la posicion del icono+texto dentro del label horizontalmente
        //label.setBounds(0,0,250,250);//Asigna la posicion del label dentro del Layout del Frame


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        //Agregamos el label al Frame
        frame.add(label);
        frame.pack();//Ajusta el tamano del Frame para contener todos los elementos dentro del Frame


    }

}
