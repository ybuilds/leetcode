package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int rem = sum - arr[i];
            if(map.containsKey(rem))
                return new int[] {map.get(rem), i};
            map.put(arr[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{3, 2, 3}, 6);
        for(int i: res)
            System.out.print(i + " ");
    }
}
