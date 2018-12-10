package leetcode.eighteen_dec_seven;


/**
 * 
 * @author 忆倾城
 * 	给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class SearchNum {
	public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
			return 0;
		}
        int i = 0;
        while(i<nums.length) {
        	if (nums[i] >= target) {
				return i;
			}else {
				i++;
			}
        }
		return nums.length;
		
		
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(nums, target));
	}
}
