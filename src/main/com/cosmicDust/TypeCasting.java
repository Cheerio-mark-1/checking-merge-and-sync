package main.com.cosmicDust;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        narrowing conversion
//        int num= (int)(12.234f);
//        System.out.println(num);
//        String length = Float.toString(123.123f);


        // automatic type promotion in expression
        byte a = 40;
        byte b = 50;
        byte c = 100;
        char e = 'A';
        int d = (a * b) / c + e;
        System.out.println((int) e);
        System.out.println(d);
        System.out.println();
    }

}
/**
 * int a = (int)(45.34f);
 * System.out.println(a);
 */
