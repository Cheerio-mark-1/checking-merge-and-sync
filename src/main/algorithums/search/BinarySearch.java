package main.algorithums.search;

/**
 * BinarySarch has
 * Time Complexity of O(log n)
 * Space Complexity of O(1)
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arrDes = {48, 36, 20, 14, 12, 11, 9, 6, 4};

//        int output = bSearch(arr, 48);
//        System.out.println(output);

//        int nextGretest = nextGretest(arr, 4);
//        System.out.println(nextGretest);

//        int miniThanElement = miniThanElement(arr, 8);
//        System.out.println(miniThanElement);

//        int output = orderAgnosticBS(arrDes, 7);
//        System.out.println(output);


    }


    private static int miniThanElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
//            if(arr[mid] == target) return mid;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(arr[end]);
        return end;
    }

    private static int nextGretest(int[] arr, int number) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//            if(arr[mid] == number) return mid;
            if (arr[mid] > number) end = mid - 1;
            else if (arr[mid] == number) return mid;
            else start = mid + 1;
        }
        System.out.println(arr[start]);
        return start;
    }


    /**
     * bSearch method find the index of the values if present with the
     * help of binary search
     * <p>
     * method implements the search by implementing the Binary Search  Algorithum
     *
     * @param arr    array to be searched
     * @param target target to be found in arr
     * @return index if value is found
     * @return -1 if value not found
     */

    private static int bSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;

        }
        return -1;
    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }

            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }

        return -1;

    }


}












