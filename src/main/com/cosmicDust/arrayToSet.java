package main.com.cosmicDust;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arrayToSet {

    /**
     * @param arr array which is to be converted to set
     * @param <T> the generic type of the values stored in array
     * @return newSet set of give array type with removed duplicate
     */
    public static <T> Set<T> arrayToSet(T arr[]) {
        Set<T> newSet = new HashSet<>();
        for (T value : arr) {
            newSet.add(value);
        }
        return newSet;
    }


    public static void main(String[] args) {
//        Integer[] arr = {1,2,3,1,3,5,1,3,6};
//        System.out.println(Arrays.toString(arr));
//        Set<Integer> out = arrayToSet(arr);
//        System.out.println(out);
        int a = 123;
        byte b = (byte) (a);
        System.out.println(b);
    }
}
