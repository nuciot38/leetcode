package leetcode.eighteen_dec_six;
/**
 * 
 * @author 忆倾城
 *	编写一个函数来查找字符串数组中的最长公共前缀。
 *	如果不存在公共前缀，返回空字符串 ""。
 */
public class CommanPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) 
			return  "";
		String prefix = strs[0];
		for(int i = 0; i < strs.length; i++) {
			int j = 0;
			while(j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
				j++;
			}
			if(j == 0) {
				return "";
			}
			prefix = prefix.substring(0, j);
		}
		return prefix;
	}
}
