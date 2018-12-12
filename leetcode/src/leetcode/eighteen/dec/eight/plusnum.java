package leetcode.eighteen.dec.eight;
/**
 * 
 * @author 忆倾城
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class plusnum {
    public static int[] plusOne(int[] digits) {
		digits[digits.length-1] += 1;
		for(int i=digits.length-1; i>=0;i--) {
			if (digits[i]<10) {
				return digits;
			}else {
				digits[i] = 0;
				if (i != 0) {
					digits[i-1] = 0;
				}
			}
		}
        int[] res = new int[digits.length+1];
        res[0] = 1;
    	return res;
    }
    public static void main(String[] args) {
		int[]a = {1, 2, 3};
		int[] result = plusOne(a);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+",");
		}
	}
}
