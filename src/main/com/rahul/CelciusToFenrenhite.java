package main.com.rahul;

import java.util.Scanner;

public class CelciusToFenrenhite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temprature in Celcius: ");
        float TempC = in.nextFloat();
        float TempF = (TempC * 9 / 5) + 32;
        System.out.println(TempF);


    }
}
