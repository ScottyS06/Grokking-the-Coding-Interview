public class MaximumSumSubarrayOfSizeK {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 3, 7, 1};
        System.out.println("Maximum sum of a subarray of size K: " + findSubArray(nums, 2));
    }

    /**
     * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray
     * of size ‘k’
     * @param nums array of integers
     * @param k length of the subarray
     * @return max sum of any contiguous subarray of size {@code k}
     *
     *  Time Complexity: O(n)
     *  Space Complexity: O(1)
     */
    public static int findSubArray(int[] nums, int k) {
        int sum = 0;
        int maxSum = sum;
        int windowStart = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
