package tree;
public class Search{
	Node root;
	void search(Node t,int key){
		if(t!=null){
			if(t.key==key){
				System.out.println("We have find "+key);
			}
			else{
				search(t.left,key);
				search(t.right,key);
			}
		}
	}
	public static void main(String... a){
		Search s=new Search();
		s.root=new Node(10);
		s.root.left=new Node(15);
		s.root.right=new Node(20);
		s.root.left.left=new Node(16);
		s.root.left.right=new Node(26);
		s.root.right.left=new Node(9);
		s.root.right.right=new Node(60);
		s.search(s.root,2);
	}
}