package leetcode.eighteen.dec.eleven;

import javax.naming.spi.DirStateFactory.Result;

public class Climb {
    public static int climbStairs(int n) {
        if (n == 1) {
			return 1;
		}
        if (n == 2) {
			return 2;
		}
        
        return climbStairs(n-1) + climbStairs(n - 2);
    }
    
    public static int climbStairs2(int n) {
    	if (n <= 1) {
			return n;
		}
    	int last = 1, lastlast = 1;
    	int now = 0;
    	for(int i = 2; i <= n; i++) {
    		now = last + lastlast;
    		lastlast = last;
    		last = now;
    	}
    	return now;
    }
    
    public static int climbStairs3(int n) {
    	if (n == 0) {
			return 0;
		}
    	
    	result = new int[n + 1];
    	for(int i = 0; i <= n; i++) {
    		result[i] = -1;
    	}
    	f(n);
    	return result[n];
    }
    static int[] result = null;
    private static void f(int n) {
		// TODO Auto-generated method stub
		if(result[n] != -1) return;
		if(n == 0 || n == 1) {
			result[n] = 1;
			return;
		}
		f(n-1);
		f(n-2);
		result[n] = result[n-1] + result[n-2];
	}

	public static void main(String[] args) {
		System.out.println(climbStairs3(999));
	}
}
