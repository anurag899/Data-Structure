import java.util.*;
class deco{
	public static void main(String... a){
		Scanner in = new Scanner(System.in);
		int i=in.nextInt();
		int j=in.nextInt();
		int count=0;
		for(int p=0;p<i;p++){
			String s = in.next();
			for(int q=0;q<j-1;q++){
				if(s.charAt(q)==s.charAt(q+1)){
					count++;
				}
			}
	}
		System.out.println(count);
	}
}