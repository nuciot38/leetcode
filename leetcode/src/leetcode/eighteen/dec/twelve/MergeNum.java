package leetcode.eighteen.dec.twelve;
/**
 * 
 * @author 忆倾城
 * 	给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 */
public class MergeNum {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while(i>=0 && j>=0) {
        	if (nums1[i]>nums2[j]) {
				nums1[index--] = nums1[i--];
			}else {
				nums1[index--] = nums2[j--];
			}
        }
        
        while(i>=0) {
        	nums1[index--] = nums1[i--];
        }
        while(j>=0) {
        	nums1[index--] = nums2[j--];
        }
        
    }
    
    public static void main(String[] args) {
		
	}
}
