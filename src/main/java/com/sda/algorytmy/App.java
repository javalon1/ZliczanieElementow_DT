package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = {4, 1, 6, 1, 1, 5, 2, 1, 1, 3, 4};
        System.out.println(Arrays.toString(tab));
        int n = tab.length;
        int x = 1;
        int wynik = 0;
        for (int i=0; i <n; i++)
            if(tab[i] == x){
                wynik++;


        }
        System.out.println(x + " wystepuje: " + wynik + " razy.");
        /*int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10) + 1; // 1 - 10
        }
        System.out.println(Arrays.toString(tab));

        int[] liczbaWystapien = new int[10];
        for (int el : tab) {    //dla każdego elementu z tab;licy
            liczbaWystapien[el - 1]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " - " + liczbaWystapien[i]);
        }*/
    }
}

