import java.util.*;
class Node{
	ArrayList<Integer> adjNode = new ArrayList<Integer>();
}
class cutVertex{
	public static final int MAX = 100007;
	static boolean vis[] = new boolean[MAX];
	static boolean ap[] = new boolean[MAX];
	static int parent[] = new int[MAX];
	static int low[] = new int[MAX];
	static int disc[] = new int[MAX];
	static int tim;
	static void init(){
		for(int i=0;i<MAX;i++){
			vis[i]=ap[i]=false;
			parent[i]=-1;
			low[i]=0;
		}
	}
	static void dfs(int u,Node[] node){
		vis[u]=true;
		low[u]=disc[u]=++tim;
		int child=0;
		for(int i=0;i<node[u-1].adjNode.size();i++){
			int v= node[u-1].adjNode.get(i);
			if(!vis[v]){
				child++;
				parent[v]=u;
				dfs(v,node);
				low[u]=Math.min(low[u],low[v]);
				if((parent[u]!=-1)&&(low[v]!=disc[u])){
					ap[u]=true;
				}
				if((parent[u]==-1)&&(child>1)){
					ap[u]=true;
				}
			}
			else if(v!=parent[u]){
				low[u]=Math.min(low[u],disc[v]);
			}
		}
	}
	public static void main(String... a){
		Scanner s=new Scanner(System.in);
		int nodes=s.nextInt();
		int edge=s.nextInt();
		Node[] node = new Node[nodes];
		for(int i=0;i<nodes;i++){
			node[i]=new Node();
		} 
		for(int i=0;i<edge;i++){
			int x=s.nextInt();
			int y=s.nextInt();
			node[x-1].adjNode.add(y);
		}
		init();
		dfs(1,node);
		for(int i=0;i<nodes;i++){
			if(ap[i]){
				System.out.println(i);
			}
			
		}
	}
}