package com.company.A3;

import java.util.Random;

public class A1C {
    public static void main(String[] args) {
        Random ZUFALL = new Random();
        for (int i = 0; i < 10; i++) {
            int counter = 1;
            int anzahlX = ZUFALL.nextInt(4) + 1;
            int amountOfOBeforeX = (int) Math.floor((10 - anzahlX) / anzahlX);
            System.out.print("Zeile 1: Zufallszahl X");
            for (int i1 = 1; i1 < anzahlX; i1++) {
                for (int i2 = 0; i2 < amountOfOBeforeX; i2++) {
                    System.out.print("O");
                    counter++;
                }
                System.out.print("X");
                counter++;
            }
            for (; counter < 10; counter++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
