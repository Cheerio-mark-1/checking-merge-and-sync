package main.com.ArraysModule;

public class BasicArray {
    public static void main(String[] args) {
        String[] arrStr = new String[10];
        System.out.println(arrStr[0]);

        int[] arrInt = new int[10];
        System.out.println(arrInt[0]);

        for (int number : arrInt) {
            System.out.println(number);
        }


    }
}
