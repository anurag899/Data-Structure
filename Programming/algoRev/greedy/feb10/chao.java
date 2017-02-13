import java.util.*;
class chao{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while(q-->0){
			int n=in.nextInt();
			int[] a = new int[n];
			boolean state = true;
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++){
				
				if(a[i]-1-i<=2){
					sum+=Math.abs(a[i]-i-1);
					i=a[i]-1;
					
				}
				else{
					state=false;
					break;
				}
			}
			if(!state){System.out.println("To Chaotic");}
			else{System.out.println(sum);}

		}
	}
}