package tree;
public class lca1{
	Node root;
	int path[]=new int[10];
	int p1[]=new int[10];
	int p2[]=new int[10];
	int pathlen;
	void lca(Node t,int a,int b){
		lca(t,a,b,path,0);
	}
	void lca(Node t,int a,int b,int path[],int pathlen){
		if(t==null){return;}
		else{
			path[pathlen++]=t.key;
			if(t.left==null && t.right==null){
				getPath(path,pathlen,a,b);
			}
			lca(t.left,a,b,path,pathlen);
			lca(t.right,a,b,path,pathlen);
		}
	}
	void getPath(int path[],int pathlen,int a,int b){
		if(path[pathlen-1]==a){
			System.arraycopy(path,0,p1,0,pathlen);
		}
		if(path[pathlen-1]==b){
			System.arraycopy(path,0,p2,0,pathlen);
		}
			}
	public static void main(String a[]){
		lca1 l=new lca1();
		l.root=new Node(1);
      	l.root.left=new Node(2);
      	l.root.right=new Node(3);
      	l.root.left.left=new Node(4);
      	l.root.left.right=new Node(5);
      	l.lca(l.root,4,3);
      	for(int i=l.p1.length-1;i>=0;i--){
      		if(l.p1[i]==l.p2[i] && l.p1[i]!=0  ){
      			System.out.println("ancester is "+l.p1[i]);
      			break;
      		}
      	}
	}
}