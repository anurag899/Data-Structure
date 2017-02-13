import java.util.*;
class reducedString{
	public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 2);
   	}
   	public static String removeChar(String s, int pos) {
      return s.substring(0, pos-1) + s.substring(pos+1);
   	}
	public static void main(String[] t){
		Scanner sc = new Scanner(System.in);
		String m = sc.next();
		int i=0;
		while(i<m.length()-1){
			if(m.charAt(i)==m.charAt(i+1)){
				m=removeCharAt(m,i);
			}
			i++;
		}
		i=1;
		while(i<m.length()){
			if(m.charAt(i)==m.charAt(i-1))
			{
				m=removeChar(m,i);
			}
			i++;
		}
		if(m.equals("")){
			System.out.println("Empty String");
		}
		else{
			System.out.println(m);
		}
	}
}