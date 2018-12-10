package leetcode.eighteen_dec_seven;

/**
 * 
 * @author �����
 *	����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 *	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 */

public class RemoveNums {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
			return 0;
		}
         
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
        	if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
        	}
        }
    	
    	return i+1;
    }
    public static void main(String[] args) {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(a);
	}
}
