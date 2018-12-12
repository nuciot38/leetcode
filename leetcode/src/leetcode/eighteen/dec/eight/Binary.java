package leetcode.eighteen.dec.eight;
/**
 * 
 * @author 忆倾城
 *	给定两个二进制字符串，返回他们的和（用二进制表示）。
 *	输入为非空字符串且只包含数字 1 和 0。
 */
public class Binary {
    public String addBinary(String a, String b) {
    	/*
    	if (a.length() < b.length()) {
			String tmp = a;
			a = b;
			b = tmp;
		}
    	
    	int pa = a.length() - 1;
    	int pb = b.length() - 1;
    	int carries = 0;
    	String rst = "";
    	
    	while(pb >= 0) {
    		int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;
    		rst = String.valueOf(sum % 2) + rst;
    		carries = sum / 2;
    		pa--;
    		pb--;
    	}
    	
    	while(pa >= 0) {
    		int sum = (int)(a.charAt(pa) - '0') + carries;
    		rst = String.valueOf(sum % 2) + rst;
    		carries = sum / 2;
    		pa--;
    	}
    	
    	if (carries == 1) {
			rst = "1" + rst;
		}
    	
    	return rst;*/
    	
    	String ans = "";
    	int carry = 0;
    	for(int i = a.length() - 1, j = b.length() -1; i >= 0 || j >= 0; i--,j--) {
    		int sum = carry;
    		sum += (i >= 0) ? a.charAt(i) - '0' : 0;
    		sum += (j >= 0) ? b.charAt(j) - '0' : 0;
    		ans = (sum % 2) + ans;
    		carry = sum / 2;
    	}
    	if (carry != 0) {
			ans = carry + ans;
		}
    	return ans;
    }
}
