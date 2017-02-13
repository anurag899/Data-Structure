class activitySelection{
	public static void main(String... a){
		int[] start = {10.45, 3.15, 12, 5, 8, 5};
		int[] finish = {2.15, 4.20, 6, 7, 9, 9};
		int t = finish[0];
		System.out.println(0);
		for(int i=1;i<start.length;i++){
			if(t<=start[i]){
				System.out.println(i);
				t=start[i];
			}
		}
	}
}