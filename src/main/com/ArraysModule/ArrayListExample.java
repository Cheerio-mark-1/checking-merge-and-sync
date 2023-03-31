package main.com.ArraysModule;

import java.util.Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 94, 3, 19};
        swap(arr, 1, 4);

        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
