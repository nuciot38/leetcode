package leetcode;

public class test {
	public static String countAndSay(int n) {
		String oldstring = "1";
		while(--n>0) {
			StringBuilder sb = new StringBuilder();
			char[] oldchars = oldstring.toCharArray();
			
			for(int i = 0;i<oldchars.length; i++) {
				int count = 1;
				while((i+1)<oldchars.length && oldchars[i] == oldchars[i+1]) {
					count++;
					i++;
				}
				sb.append(String.valueOf(count)+String.valueOf(oldchars[i])); 
			}
			oldstring = sb.toString();
		}
		return oldstring;
	}
	
	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
}
