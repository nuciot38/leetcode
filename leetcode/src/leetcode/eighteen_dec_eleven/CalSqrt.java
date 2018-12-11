package leetcode.eighteen_dec_eleven;

/**
 * 
 * @author 忆倾城
 *实现 int sqrt(int x) 函数。
 *计算并返回 x 的平方根，其中 x 是非负整数。
 *由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class CalSqrt {
    public int mySqrt(int x) {
        int sqrt = (int)Math.sqrt(x);
        return sqrt;
    }
    //二分法
    public static int mySqrt2(int x) {
    	long X = (long)x;
    	long l = 1, r = X;
    	
    	while (l + 1 < r) {
    		long mid = l + (r-l)/2;
    		if (mid * mid == X) {
                return (int) mid;
    		}else if (mid * mid < X) {
                l = mid;
			}else {
                r = mid;
			}
    	}
    	
    	if (r*r == X)
    		return (int)r;
    	return (int)l;
    }
//    牛顿迭代法
//    n = t * t
//    n + t * t = 2 * t * t
//    (n / t) + t = 2 * t
//    t = (n / t + t) / 2
    public static int mySqrt3(int x) {
    	double guess = 1.0;
    	while(Math.abs(x - guess * guess) > 0.1) {
    		guess = (x / guess + guess) / 2;
    	}
    	return (int)guess;
    }
    public static void main(String[] args) {
		System.out.println(mySqrt3(999999999));
	}
}
