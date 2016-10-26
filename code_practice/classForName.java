import java.util.*;
interface Base{
	void fun();
}
class A implements Base{
	public void fun(){
		System.out.println("Class:A");
	}
}
class B implements Base{
	public void fun(){
		System.out.println("Class:B");
	}
}
class classForName{
	public static void main(String a[]){
		try{
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			Base b=(Base)Class.forName(s).newInstance();
			b.fun();
		}
		catch(Exception e){

		}
	}
}