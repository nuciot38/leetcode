package leetcode.eighteen_dec_eight;

/**
 * 
 * @author 忆倾城
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */

public class MaxSub {
    public static int maxSubArray(int[] nums) {
//    	int[] maxValue = new int[nums.length];
//    	int res = nums[0];
//    	maxValue[0] = nums[0];
//    	for(int i = 1; i < nums.length; i++) {
//    		maxValue[i] = ((maxValue[i-1] + nums[i])>nums[i]?(maxValue[i-1]+nums[i]):nums[i]);
//    		if (maxValue[i]>res) {
//				res = maxValue[i];
//			}
//    	}
//    	return res;
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
    public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
