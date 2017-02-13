import java.io.*;
import java.util.*;
 class Solution { 
	public static void main(String[] args)
	 {
	 Scanner scn=new Scanner(System.in); 
	 int q=scn.nextInt(); 
	 int max; 
	 int a[][]=new int[256][256];
    for(int i=0;i<q;i++)
        {
        int n=scn.nextInt();

        for(int j=0;j<2*n;j++)
            {
            for(int k=0;k<2*n;k++)
                {
                a[j][k]=scn.nextInt();
            }
        }
        int Sum=0;
        for(int j=0;j<n;j++)
            {
            max=0;
            for(int k=0;k<n;k++)
                {
                max=Math.max(Math.max(a[j][k],a[j][(2*n)-k-1]),Math.max(a[(2*n)-j-1][(2*n)-k-1],a[(2*n)-j-1][k])	);
                Sum=Sum+max;
            }

        }
        System.out.println(Sum);
    }
}
}