class Child extends Base{
	public void init(){
		System.out.println("Class:Child");
	}
	public static void main(String a[]){
		Base c=new Child();
		c.init();
		//System.out.println(c.name);
		Child b=new Child();
		b.init();
		//System.out.println(b.name);
	}
}