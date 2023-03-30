package main.algorithums.search;

import java.util.Random;
import java.util.Arrays;


public class LinarSearch {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = {34, 64, 91, 83, 77, 80, 36, 35, 92, 54};

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(100);
//        }
        System.out.println(Arrays.toString(arr));

        int foundIndex = linearSearch(arr, 80);
        System.out.println(foundIndex);

    }

    /**
     * Search the array in linear fasion
     * this method implement the linear search mechanisum
     *
     * @param arr    array in which target to be found
     * @param target search value
     */

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

}

//        System.out.println(Arrays.toString(arr));
