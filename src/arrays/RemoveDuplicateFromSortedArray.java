package arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int duplicates=0, i=0, j=1, k=1;

        while(i < nums.length && j < nums.length) {
            while(nums[i] == nums[j]) {
                duplicates++;
                j++;
            }
            nums[k++] = nums[j];
            i = j++;
        }

        for(k=nums.length-duplicates; k<nums.length; k++)
            nums[k] = Integer.MAX_VALUE;

        List<Integer> res = new ArrayList<>();
        for(int num: nums) {
            if(num != Integer.MAX_VALUE)
                res.add(num);
        }

        System.out.println(res);

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
