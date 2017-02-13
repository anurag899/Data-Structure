import java.util.*;

class TestClass {
	static long gcd(long a, long b)
	{
	    if (a == 0)
	        return b;
	    return gcd(b%a, a);
	}
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        long arr[]= new long[1000000];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<1000000;i++){
        	arr[i]=arr[i-1]+arr[i-2];
        }
        while(t--!=0){
            int m=s.nextInt();
            int n=s.nextInt();
            long mth=arr[m-1];
            long nth=arr[n-1];
            System.out.println(gcd(mth,nth)%(1000000000+7));
    
        }
    }
}
