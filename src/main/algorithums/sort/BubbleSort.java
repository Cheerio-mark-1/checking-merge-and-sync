package main.algorithums.sort;

import java.util.Arrays;

/**
 * Bubble Sort sorts the array by comparing the  adjecant cell values
 * Time Complexity O(n^2)
 * Space Complexity O(1)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 93, 56, 77, 9, 76, 9, 25, 73, 4, 21, 23, 79, 55, 24, 0, 69, 14, 94, 8};
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }

        }


    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
