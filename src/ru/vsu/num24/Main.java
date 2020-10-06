package ru.vsu.num24;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] box1 = new double[3];
        double[] box2 = new double[3];
        inputSizes(box1);
        inputSizes(box2);
        Arrays.sort(box1);
        Arrays.sort(box2);
        printBox(box1);
        printBox(box2);
        compareBox(box1, box2);
    }
    public static void compareBox(double[] box1, double[] box2){
        if(box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) System.out.println("Box 2 fits in 1.");
        if(box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) System.out.println("Box 1 fits in 2.");
        else System.out.println("Boxes cannot be placed inside one another.");
    }
    public static void printBox(double[] box){
        for(int i = 0; i < box.length; i++){
            System.out.print(box[i] + "   ");
        }
        System.out.println();
    }
    public static void inputSizes(double[] box) {
        System.out.println("Enter the dimensions of the box:");
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            box[i] = scn.nextDouble();
        }
    }
    }
}
