package com.training;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {

        Scanner scanner = new Scanner(System.in);

        //Creamos la instancia de File, para el archivo que leeremos
        File file = new File("Level_Up.wav");
        //Creamos un stream de Audio y le damos el archivo como parametro
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R= Resest, Q= Quit");
            System.out.println("Enter your choice");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"):
                    //El audio comienza en un hilo separado
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }

        }
        System.out.println("Bye");

    }

}
