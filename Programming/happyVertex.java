import java.util.*;
class Node{
	ArrayList<Integer> adjNode = new ArrayList<Integer>();
}
class happyVertex{
	static int max,count;
	static void DFS(Node[] node,int u,boolean[] vis,int parent){
		vis[u-1]=true;
		int child=0;
		parent++;
		System.out.print("parent "+parent+" ");
		for(int i=0;i<node[u-1].adjNode.size();i++){
			int t=node[u-1].adjNode.get(i);
			if(!vis[t-1]){
				child++;
				vis[t-1]=true;
				DFS(node,t,vis,parent);
			}
		}
		if(max<child){
			max=child;
			count++;
		}
		System.out.println("child "+child);

	}
	public static void main(String... a){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Node[] node=new Node[n];
		for(int i=0;i<n;i++){
			node[i]=new Node();
		}
		for(int i=0;i<m;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			node[x-1].adjNode.add(y);
			node[y-1].adjNode.add(x);
		}
		boolean[] vis=new boolean[n];
		int parent=0;
		DFS(node,1,vis,parent);
		System.out.println(count);
	}
}