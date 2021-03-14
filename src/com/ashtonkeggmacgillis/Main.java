package com.ashtonkeggmacgillis;
import java.util.Scanner;

public class Main{
        public static void main(String[]args){
            convertFToC();
        }

        /*gets input representing fahrenheit and displays celsius equivalent*/
        public static void convertFToC(){

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Fahrenheit temperature");
                double fahrenheit = scan.nextInt();
                System.out.println(fahrenheit + " degrees Fahrenheit is " + toCelsius(fahrenheit) + " degrees Celsius");



            }



        /* calculates and returns the celsius equivalent */
        public static double toCelsius(double fahr){
            int BASE = 32;
            double CONVERSION_FACTOR = 9.0/ 5.0;
            double celsius = ((fahr-BASE)/(CONVERSION_FACTOR));
            return celsius;
        }
}



