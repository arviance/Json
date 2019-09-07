package com.dalircode.java;

public class Random {
    public static void createRandom() {
        int min = 1;
        int max = 20;
        int range = (max - min) + 1;
        //Creating one random number between 1 and 20
        int random = (int) (min + (Math.random() * 20));
        System.out.println("Random number: " + random);

        //Creating 20 random numbers between 1 and 20
//        for (int i = 0; i < 20; i ++) {
//            int random = (int) (min + (Math.random() * 20));
//            System.out.println("The random numbers: " + random);
//        }
    }
}
