package leetcode.eighteen.dec.eight;
/**
 * 
 * @author �����
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
 * ����Լ���������� 0 ֮�⣬��������������㿪ͷ��
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
