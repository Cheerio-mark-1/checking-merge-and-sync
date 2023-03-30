package main.com.cosmicDust;

import java.io.FileInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
//            int a = input.nextInt();
//            System.out.println(a);
//            System.out.println(input.nextInt());
//            large decimal numbers
            float floadNumber = 124.23f;
            double largeDecimalValues = 123345.123;
            long largetIntegerValues = 12334545667L;
            boolean values = false;
            int[] arr = {1, 2, 3, 4, 5, 6};
            Set<Integer> newSet = new HashSet<>();

            newSet.add(1);
            newSet.add(3);
            newSet.add(1);

            newSet.add(1);
            newSet.add(1);
            newSet.add(2);


            System.out.println(newSet);

            System.out.println(floadNumber);
            System.out.println(largeDecimalValues);
            System.out.println(largetIntegerValues);


        } catch (Exception e) {
            System.out.println(e);

            System.out.println("in the catch block");
        }
    }
}