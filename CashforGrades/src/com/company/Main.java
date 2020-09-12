package com.company;
import java.util.Scanner;

public class Main {


    private static String name;
    private static double gpa;

    public static void main(String[] args) {
        // write your code here

        computeAward(name, gpa); //passes name and gpa to computeAward method

    }//ends main method



    public static void  computeAward(String name, double gpa) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        name = sc.nextLine();
        //Stores your name as a string

        System.out.print("Enter Your GPA: ");
        gpa = sc.nextDouble();
        //Stores GPA as a double

        final double MULTIPLIER = 150;
        //Stores 150 as a named constant

        double totalCash = (gpa * MULTIPLIER);
        //multiplies your gpa by the named constant 150

                System.out.println(name +", since your GPA is " + gpa + " you will recieve a payout from NRCC's Cash for Grades Program!");
               //Prints a sconcatenated string to console
                System.out.printf("Your expected payout is $%.02f", totalCash);
                //Prints payout info to console

        }
  }//ends computeAward method
//ends Main class

