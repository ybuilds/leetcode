package arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int duplicate=0, i=0, j=1, k=1;

        while(j<nums.length) {
            while(j<nums.length && nums[i] == nums[j]) {
                duplicate++;
                j++;
            }

            if(j < nums.length)
                nums[k++] = nums[j];

            i = j++;
        }

        for(int num: nums)
            System.out.print(num + " ");

        return nums.length-duplicate;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
