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
        compareBox(box1, box2);
    }
    public static void compareBox(double[] box1, double[] box2){
        Answer currentAnswer;
        if(box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) currentAnswer = Answer.BOX_2_FITS_IN_1;
        else if(box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) currentAnswer = Answer.BOX_1_FITS_IN_2;
        else currentAnswer = Answer.BOXES_CANNOT_BE_PLACED_INSIDE_ONE_ANOTHER;
        outputAnswerToConsole(currentAnswer);
    }
    public static void outputAnswerToConsole(Answer currentAnswer) {
        System.out.println(currentAnswer);
    }

    public static void readSizes(double[] box) {
        System.out.println("Enter the dimensions of the box:");
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            box[i] = scn.nextDouble();
        }
    }
    }

