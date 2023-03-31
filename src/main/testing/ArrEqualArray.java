package main.testing;

import java.util.HashMap;
import java.util.Map;

public class ArrEqualArray {
    public boolean areEqual(int[] arr1, int[] arr2) {
        int N = arr1.length;
        int M = arr2.length;

        if (N != M) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (hashMap.get(arr1[i]) == null) {
                hashMap.put(arr1[i], 1);
            } else {
                count = hashMap.get(arr1[i]);
                count++;
                hashMap.put(arr1[i], count);
            }

        }

//        iterate through 2nd array and check if they exists
        for (int i = 0; i < M; i++) {
            if (!hashMap.containsKey(arr1[i])) {
                return false;
            }

            if (hashMap.get(arr1[i]) == 0) {
                return false;
            }
            count = hashMap.get(arr1[i]);
            count--;
            hashMap.put(arr1[i], count);
        }


        return true;
    }

}
