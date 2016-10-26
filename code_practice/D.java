class D{
		int a,b;
		void init(int a,int b){
			this.a=a;
			this.b=b;
		}
		public static void main(String ar[]){
			D demo=new D();
			demo.init(15,20);
			System.out.println(demo.a+" "+demo.b);
		}
}