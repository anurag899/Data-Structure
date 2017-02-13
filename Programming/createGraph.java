import java.util.*;
class Node{
	ArrayList<Integer> adjNode=new ArrayList<Integer>();
}
class createGraph{
	static void DFS(Node[] node,int u,int nodes){
		boolean visited[] = new boolean[nodes];
		Stack<Integer> st= new Stack<Integer>();
		st.push(u);
		visited[u-1]=true;
		while(!st.empty()){
			u=st.peek();
			st.pop();
			System.out.println(u);
			for(int v=node[u-1].adjNode.size()-1;v>=0;v--){
				int t= node[u-1].adjNode.get(v);
				if(!visited[t-1]){
					st.push(t);
					visited[t-1]=true;
				}
			}
		}
	}
	static void DFS(Node[] node,int u,boolean[] visited){
		visited[u-1]=true;
		System.out.println(u);
		for(int v=0;v<=node[u-1].adjNode.size()-1;v++){
			int t=node[u-1].adjNode.get(v);
			if(!visited[t-1]){
				visited[t-1]=true;

				DFS(node,t,visited);
			}
		}
	}
	public static void main(String[] a){
		int edges,node;
		Scanner sc = new Scanner(System.in);
		node = sc.nextInt();
		edges= sc.nextInt();
		boolean visited[] = new boolean[node];
		Node[] nodes = new Node[node];
		for(int i=0;i<node;i++){
			nodes[i]=new Node();
		}
		for(int i=0;i<edges;i++){
			int x= sc.nextInt();
			int y= sc.nextInt();
			nodes[x-1].adjNode.add(y);
		}
		//DFS(nodes,1,node);
		//System.out.println("NEW");
		//DFS(nodes,1,visited);
		int connectNode=0;
		for(int i=1;i<=node;i++){
			if(!visited[i-1]){
				
				DFS(nodes,i,visited);
				connectNode++;
				System.out.println("connected nodes are : "+connectNode+" "+visited[i-1]);
			}
		}
		System.out.println("connected nodes are : "+connectNode);
		}
	}

