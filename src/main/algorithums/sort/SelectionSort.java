package main.algorithums.sort;

import java.util.Arrays;

/**
 * <p>
 * Selection sort is a simple sorting algorithm.
 * the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end
 * </p>
 *
 * <p>
 * The smallest element is selected from the unsorted array and
 * swapped with the leftmost element,
 * and that element becomes a part of the sorted array. This process continues moving
 * unsorted array boundary by one element to the right.
 * </p>
 * <br/>
 * <b>Time Complexity O(n^2)</b><br/>
 * <b>Space Complexity O(1)</b>
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 93, 56, 77, 9, 76, 9, 25, 73, 4, 21, 23, 79, 55, 24, 0, 69, 14, 94, 8};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void selectionSort(int[] arr) {
        for (int soreted = 0; soreted < arr.length; soreted++) {
            int smallest = arr[soreted];
            int index = soreted;
            for (int i = soreted; i < arr.length; i++) {
                if (smallest > arr[i]) {
                    smallest = arr[i];
                    index = i;
                }
            }
            swap(arr, soreted, index);
//            System.out.println(index);

        }

//        int soreted = 0;

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
/*

        int sorted ;
        while(sorted > arr.length){
            int currentSmallest = arr[0];
            int curretnSmallestIndex ;
            for (int i = sorted; i < arr.length; i++) {
                if(currentSmallest > arr[i]){
                    currentSmallest = arr[i];
                    currentSmallest = i;
                }
            }
        }
 *
 */
