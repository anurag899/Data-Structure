interface fun{
	void print();
}
public class Inter implements fun {
	public void print(){
		System.out.println("used interface");
	}
	public static void main(String... a){
		Inter in=new Inter();
		in.print();
	}
}
