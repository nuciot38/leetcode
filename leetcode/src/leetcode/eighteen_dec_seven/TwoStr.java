package leetcode.eighteen_dec_seven;
/**
 * 
 * @author �����
 *	����һ�� haystack �ַ�����һ�� needle �ַ�����
 *	�� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)��
 *	��������ڣ��򷵻�  -1��
 */
public class TwoStr {
	//LeetCode 10ms
	public static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 || needle == null) {
			return -1;
		}
        if (haystack.length() < needle.length()){
            return -1;
        }
		for(int i = 0;i<haystack.length()-needle.length()+1; i++) {
			int j = 0;
			for(j = 0; j<needle.length(); j++) {
				if(haystack.charAt(i+j) != needle.charAt(j))
					break;
			}
			if (j == needle.length()) {
				return i;
			}
		}
		
		//LeetCode 4ms
	    int l1=haystack.length(),l2=needle.length();
	    if(l1<l2) {
	        return -1;
	    }else if(l2==0) {
	        return 0;
	    }
	    int threshold=l1-l2;
	    for(int i=0; i<=threshold;i++) {
	        if(haystack.substring(i,i+l2).equals(needle)) {
	            return i;
	        }
	    }
		
		
		return -1;
	}
	


	
	public static void main(String[] args) {
		String haystack = "";
		String needle = "a";
//		strStr(haystack, needle);
		System.out.println(strStr(haystack, needle));
	}
}
