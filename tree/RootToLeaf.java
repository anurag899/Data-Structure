package tree;
public class RootToLeaf{
	Node root;
	int path[]=new int[10];
	int pathlen;
	void rTol(Node t){
		rootTol(t,path,0);
	}
	void rootTol(Node t,int path[],int pathlen){
		if(t==null){
			return;
		}
		path[pathlen++]=t.key;
		if(t.left==null && t.right==null){
			printPath(path,pathlen);
		}
		else{
			rootTol(t.left,path,pathlen);
			rootTol(t.right,path,pathlen);
		}
	}
	void printPath(int path[],int p){
		for(int i=0;i<p;i++){
			System.out.printf("%d->",path[i]);
		}
		System.out.println("\n");
	}
	public static void main(String a[]){
		RootToLeaf l=new RootToLeaf();
		l.root=new Node(1);
      	l.root.left=new Node(2);
      	l.root.right=new Node(3);
      	l.root.left.left=new Node(4);
      	l.root.left.right=new Node(5);
      	l.rTol(l.root);
	}
}