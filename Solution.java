public class Solution {
    public static void dominantIndex(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }
        System.out.println(max);

        int secondMax = 0;
        boolean switched = false;
        for(int i = 0; i < nums.length; i++) {
            if(switched == false && i != max) {
                secondMax = i;
                switched = true;
            } else if(nums[i] > nums[secondMax] && i != max) {
                secondMax = i;
            }
        }
        System.out.println(secondMax);

        if(nums[max] >= nums[secondMax] * 2) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 1};
        dominantIndex(nums);
    }
}