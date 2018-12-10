package leetcode.eighteen_dec_seven;

public class RemoveEle {
    public int removeElement(int[] nums, int val) {
//        int len = nums.length;
//        if (len == 0 || nums == null) {
//			return 0;
//		}
//        for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == val) {
//				len = len - 1;
//			}
//		}
//        return len;
    	/*
    	 * 	为什么返回数值是整数，但输出的答案是数组呢?
    	 * 	请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
    	 */
	    int i = 0;
	    for(int j = 0; j<nums.length; j++){
	        if(nums[j] != val){
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
    }

}
