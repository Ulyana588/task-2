package ru.vsu.num24;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] box1 = new double[3];
        double[] box2 = new double[3];
        readSizes(box1);
        readSizes(box2);
        Arrays.sort(box1);
        Arrays.sort(box2);
        Case currentCase = compareBox(box1, box2);
        printCase(currentCase);
    }
    public static Case compareBox(double[] box1, double[] box2){
        Case currentCase;
        if(box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) currentCase = Case.CASE1;
        else if(box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) currentCase = Case.CASE2;
        else currentCase = Case.CASE3;
        return currentCase;
    }
    public static void printCase(Case currentCase) {
        if(currentCase == Case.CASE1) System.out.println("Box 2 fits in box 1");
        if(currentCase == Case.CASE2) System.out.println("Box 1 fits in box 2");
        if(currentCase == Case.CASE3) System.out.println("Boxes cannot be placed inside one another");
    }

    public static void readSizes(double[] box) {
        System.out.println("Enter the dimensions of the box:");
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            box[i] = scn.nextDouble();
        }
    }
    }

