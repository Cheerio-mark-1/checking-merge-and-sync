package main.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArra {
//    public static void main(String[] args) {
//        int[] arr = {5, 7, 7, 7, 7, 10, 11, 23};
//        int target = 7;
//
//        int first = findFirstElement(arr, target, true);
//        int second = findFirstElement(arr, target, false);
//        System.out.println(Arrays.toString(new int[]{first, second}));
//
//
//    }

    public int[] getValues(int[] arr, int target) {
        return new int[]{findFirstElement(arr, target, true), findFirstElement(arr, target, false)};
    }

    int findFirstElement(int[] arr, int target, boolean first) {
        int output = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                output = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return output;
    }


}

/*
class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] output = {-1,-1};

        int first = findFirstElement(arr, target);
        int second = findSecondElement(arr, target);



        return new int[]{first, second};

        }

    public int findSecondElement(int[] arr, int target){
        int output = -1;

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
               end = mid - 1;
            }else{
                // target found but to find the first element
                output = mid;
                start = mid +1;
            }
        }

            return output;

    }
    public int findFirstElement(int[] arr, int target){
        int output = -1;

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
               end = mid - 1;
            }else{
                // target found but to find the first element
                output = mid;
                end = mid -1;
            }
        }

            return output;

    }


}
 */