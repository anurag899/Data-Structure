import java.util.*;
class compiler{
	public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){	
			String val=in.nextLine();
			boolean find=false;
			for(int i=0;i<val.length();i++){
				if(val.charAt(i)=='/'){find=true;}
				else if(!find){
					if(val.charAt(i)=='-' && val.charAt(i+1)=='>'){
						val = val.substring(0,i)+'.'+val.substring(i+2);
					}
				}
			}
        	System.out.println(val);
        }
		
	}
}