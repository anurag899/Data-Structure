import java.util.*;

class TestClass {
    static int sumdiv(int n){
        Set<Integer> set = new HashSet<Integer>();
        int sum=1;
        for (int i=2; i<=Math.sqrt(n)+1; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    set.add(i);
     
                else // Otherwise print both
                    set.add(i);
                    int m=n/i;
                    set.add(m);
                    // System.out.println(i+" "+n/i);
            }
        }
        // System.out.println(set.size());
        Iterator<Integer> ir = set.iterator();
        while(ir.hasNext()){
            // System.out.println(ir.next());
            sum+=ir.next();
        }
        //System.out.println(sum);
        return sum;
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        while(q-->0){
            int n=s.nextInt();
            if(n==sumdiv(n)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
