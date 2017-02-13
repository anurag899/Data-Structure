class prefixTable{
	public static void main(String... a){
		String t ="aaabccddd";
		int len =0;
		int i=1;
		int[] arr = new int[t.length()];
		arr[0]=0;
		while(i<t.length()){
			if(t.charAt(len)==t.charAt(i)){
				len++;
				arr[i]=len;
				i++;
			}
			else{
				if(len!=0){
					len=arr[len-1];
				}
				else{
					arr[i]=0;
					i++;
				}
			}
		}
		i=0;
		int j=0;
		// String txt="aabababaaaababacababaaababaabbbaababaca";
		// while(i<txt.length()){
		// 	if(txt.charAt(i)==t.charAt(j)){
		// 		if(j==t.length()-1){
		// 			System.out.println(i-j+1);
		// 			j=0;
		// 			i++;
		// 		}
		// 		else{
		// 			i++;
		// 						j++;
		// 						}
		// 					}
		// 	else if(j>0){
		// 		j=arr[j-1];
		// 	}
		// 	else{
		// 		i++;
		// 	}
		// 	}
		
		for(int m:arr){
			System.out.printf("%d\t",m);
		}

	}
}