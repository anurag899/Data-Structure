import java.math.*;
import java.util.*;
class skyler{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		while(t--!=0){
			String k = s.next();
			int m = s.nextInt();
			String str = Integer.toBinaryString(m);
			BigInteger divisor = new BigInteger(str, 2);
		    BigInteger dividend = new BigInteger(k, 2);
	    	BigInteger result = dividend.mod(divisor);
			if((result.toString(2)).equals("0")){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
	}
}
}