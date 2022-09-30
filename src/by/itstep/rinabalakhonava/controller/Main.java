package by.itstep.rinabalakhonava.controller;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] array;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int item : array) {
            item *= 2;
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
