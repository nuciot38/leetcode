package leetcode.eighteen_dec_eleven;

/**
 * 
 * @author �����
 *ʵ�� int sqrt(int x) ������
 *���㲢���� x ��ƽ���������� x �ǷǸ�������
 *���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 */
public class CalSqrt {
    public int mySqrt(int x) {
        int sqrt = (int)Math.sqrt(x);
        return sqrt;
    }
    //���ַ�
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
//    ţ�ٵ�����
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
