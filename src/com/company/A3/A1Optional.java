package com.company.A3;

import java.util.Date;
import java.util.Random;

public class A1Optional {
    public static int[] bitwiseInt = new int[20000];
    public static int[] nonBitWise = new int[20000];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < bitwiseInt.length; i++) {
            bitwiseInt[i] = random.nextInt(2147483647);
        }

        for (int i = 0; i < nonBitWise.length; i++) {
            nonBitWise[i] = random.nextInt(2147483647);
        }


        Date date = new Date();

    }

    public String numberToBit(int number){

    }
}



public class SingletonClass {
    private static SingletonClass SINGLE_INSTANCE = null;
    private SingletonClass() {}
    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized(SingletonClass.class) {
                SINGLE_INSTANCE = new SingletonClass();
            }
        }
        return SINGLE_INSTANCE;
    }
}