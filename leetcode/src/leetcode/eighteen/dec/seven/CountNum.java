package leetcode.eighteen.dec.seven;

public class CountNum {
    public static String countAndSay(int n) {
    	String oldString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char [] oldChars = oldString.toCharArray();
            System.out.println(oldString);
            for (int i = 0; i < oldChars.length; i++) {

                int count = 1;
                while ((i+1) < oldChars.length && oldChars[i] == oldChars[i+1]) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }
            oldString = sb.toString();
        }

        return oldString;
    	
    }
    public static void main(String[] args) {
		System.out.println(countAndSay(8));
	}
}
