package leetcode.eighteen_dec_six;

import java.util.HashMap;

/*
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */

public class RomToInt {
    public int romanToInt(String s) {
    	if (s.length()==0 || s == null) {
			return 0;
		}
    	HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    	
        int length = s.length();
        int result = map.get(s.charAt(length-1));
        for(int i =length-2; i>=0; i--) {
        	if(map.get(s.charAt(i+1))<=map.get(s.charAt(i))) {
        		result += map.get(s.charAt(i));
        	}else {
        		result -= map.get(s.charAt(i));
        	}
        }
    	return result;
    }
}
