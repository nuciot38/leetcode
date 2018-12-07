package leetcode.eighteen_dec_six;

public class isPalindromeNum {
	public boolean isPalindrome(int x) {
		return String.valueOf(x).equals(new StringBuffer(x+"").reverse().toString());
	}
}
