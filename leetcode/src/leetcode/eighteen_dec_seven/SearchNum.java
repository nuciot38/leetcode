package leetcode.eighteen_dec_seven;


/**
 * 
 * @author �����
 * 	����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
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
