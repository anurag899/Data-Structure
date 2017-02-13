import java.util.*;
class monkPalindrome{
	public static void main(String[] a){
		Scanner in  = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			String orginal = in.next();
			int i=0;
			int j=orginal.length()-1;
			boolean status = true;
			while(j>i){
				if(orginal.charAt(i)!=orginal.charAt(j)){
					status=false;
					break;
				}
				i++;
				j--;
			}
			String behav = (orginal.length()%2==0)?"EVEN":"ODD";
			if(status){
				System.out.println("YES"+" "+behav);
			}
			else{
				System.out.println("NO");	
			}
		}
	}
}