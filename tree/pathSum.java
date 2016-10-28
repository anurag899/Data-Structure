package tree;
public class pathSum{
	Node root;
	int path[]=new int[10];
	int pathlen;
	int p[]=new int[10];
	boolean rTol(Node t,int key){
		return rTol(t,path,0,key);
	}
	boolean rTol(Node t,int path[],int pathlen,int key){
		if(t==null){
			return false;
		}
		path[pathlen++]=t.key;
		if(t.left==null && t.right==null){
			if(printPath(path,pathlen,key)){
				for(int i=0;i<path.length;i++){p[i]=path[i];}
				return true;
			}
		}
		else{
			return (rTol(t.left,path,pathlen,key)||rTol(t.right,path,pathlen,key));
		}
		return false;
	}
	boolean printPath(int path[],int p,int key){
		int sum=0;
		for(int i=0;i<p;i++){sum+=path[i];}
		return (sum==key)?true:false;
	}
	public static void main(String a[]){
		pathSum l=new pathSum();
		l.root=new Node(1);
      	l.root.left=new Node(2);
      	l.root.right=new Node(3);
      	l.root.left.left=new Node(4);
      	l.root.left.right=new Node(5);
      	if(l.rTol(l.root,10)){
      		System.out.println("path is exist and the path is :)");
      		for(int i=0;l.p[i]!=0;i++){
      			System.out.printf("%d->",l.p[i]);
      		}}
      	else{
      		System.out.println("path is not exist :)");
      	}
	}	
}