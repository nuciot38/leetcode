package leetcode.eighteen_dec_eight;
/**
 * 
 * @author �����
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
 * ������������һ�����ʣ��뷵�� 0 ��
 */
public class WordLength {
    public static int lengthOfLastWord(String s) {
    	if(s.length() == 0 || s == null) {
    		return 0;
    	}
    	char[] cs = s.toCharArray();
    	int length = 0;
    	for(int i = cs.length-1; i>= 0;i--) {
    		if (length == 0) {
				if (cs[i] == ' ') {
					continue;
				}else {
					length++;
				}
			}else {
					if (cs[i] == ' ') {
						break;
					}else {
						length++;
					}
			}
    	}
    	return length;
        
    }
    public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a "));;
	}
}
