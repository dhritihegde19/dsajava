public class MaxSumSub {
    public static int subSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        else if (nums.length < 1) return -1;

        int cSum = nums[0];
        int mSum = nums[0];

        for (int index = 1; index < nums.length; index++) {
            cSum = Math.max(nums[index], cSum + nums[index]);
            mSum = Math.max(mSum, cSum);
        }

        return mSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(subSum(nums));
    }
}
