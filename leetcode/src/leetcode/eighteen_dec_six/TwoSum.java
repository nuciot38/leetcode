package leetcode.eighteen_dec_six;

import java.awt.print.Printable;
import java.util.HashMap;

/*
 * 	����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
 * 	����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
 * 	
 * 	���� nums = [2, 7, 11, 15], target = 9
 * 	��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 * 	���Է��� [0, 1]
 */

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("begin");
		twoSum(nums, target);
	}
	
	/*
	//������
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
	
	
	//����hash��
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//��ÿ��Ԫ�ص�ֵ��ӵ�����
		for(int i = 0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		//���ÿ��Ԫ������Ӧ��Ŀ��Ԫ��(target-nums[i])�Ƿ�����ڱ���
		for(int i = 0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/*
	//һ��hash��
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
