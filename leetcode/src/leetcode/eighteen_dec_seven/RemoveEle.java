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
    	 * 	Ϊʲô������ֵ��������������Ĵ���������?
    	 * 	��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
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
