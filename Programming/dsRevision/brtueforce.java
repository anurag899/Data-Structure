import java.io.*;
class brtueforce{
	public static void main(String[] a){
		try{
			FileInputStream fin = new FileInputStream("test.txt");
			byte[] b = new byte[1000];
			fin.read(b);
			String txt = new String(b);
			fin.close();
			String pat = "the";
			int n = txt.length();
			int m = pat.length();
			for(int i=0;i<=n-m;i++){
				int j=0;
				while(j<m && pat.charAt(j) == txt.charAt(i+j)){
					j++;
				}
				if(j==m){
					System.out.println(i);
				}
			}
			System.out.println("Not Found");
			// System.out.println(txt);
		}
		catch(Exception e){}
	}
}