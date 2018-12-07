package leetcode.eighteen_dec_six;

import java.awt.print.Printable;
import java.util.HashMap;

/*
 * 	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 	
 * 	给定 nums = [2, 7, 11, 15], target = 9
 * 	因为 nums[0] + nums[1] = 2 + 7 = 9
 * 	所以返回 [0, 1]
 */

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("begin");
		twoSum(nums, target);
	}
	
	/*
	//暴力法
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i<nums.length-1; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		int res[] = {};
		return res;
	}
	*/
	
	
	//两遍hash表
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//将每个元素的值添加到表中
		for(int i = 0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		//检查每个元素所对应的目标元素(target-nums[i])是否存在于表中
		for(int i = 0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/*
	//一遍hash表
    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i = 0; i<nums.length;i++) {
    		if(map.get(nums[i]) != null) {
    			int [] res = {map.get(nums[i]), i};
    			return res;
    		}
    		map.put(target-nums[i], i);
    	}
    	int []res = {};
    	return res;
    }
	*/
}
