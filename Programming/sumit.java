import java.util.*;
class sumit{
	public static void main(String[] m){
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		String[] list = new String[s];
		for(int i=0;i<s;i++){
			list[i]=in.next();
		}
		for(int i=0;i<s-1;i++){
			for(int j=0;j<s-i-1;j++){
				if(list[j].length() > list[j+1].length()){
					String temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		for(String l:list)
			System.out.println(l);
	}
}