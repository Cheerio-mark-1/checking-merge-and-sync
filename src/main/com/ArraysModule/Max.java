package main.com.ArraysModule;

import java.util.Arrays;

import static main.com.ArraysModule.ArrayListExample.*;


public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 59, 9, 29};
        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr Array to be reverse
     * @return void reverse the Array in place
     */

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
        return;
    }

    private static int max(int[] arr) {
        int max = 0;
        for (int number :
                arr) {
            if (max < number) max = number;
        }

        return max;
    }
}
