package tree;
public class Bt {
	Node root;
	void inOder(Node t){
		if(t!=null){
			inOder(t.left);
			System.out.printf("%d\t",t.key);
			inOder(t.right);
		}
	}
	public static void main(String a[]){
		Bt bt=new Bt();
		bt.root=new Node(10);
		bt.root.left=new Node(15);
		bt.root.right=new Node(20);
		bt.inOder(bt.root);
		System.out.printf("\n");
	}
}