import java.util.*;
class node{
	ArrayList<Integer> adjNode = new ArrayList<Integer>();
}
class unreachableNode{
	static void DFS(node[] nodes,int u,boolean[] visited){
		visited[u-1]=true;
		 System.out.println(u);
		count++;
		for(int v=0;v<nodes[u-1].adjNode.size();v++){
			int t=nodes[u-1].adjNode.get(v);
			if(!visited[t-1]){
				visited[t-1]=true;
				DFS(nodes,t,visited);
			}
		}
	}
	static int count;
	public static void main(String... ar){
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int edges = sc.nextInt();
		node[] nodes = new node[node];
		for(int i=0;i<node;i++){
			nodes[i]=new node();
		}
		for(int i=0;i<edges;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			nodes[x-1].adjNode.add(y);
		}
		for(int i=0;i<node;i++){
			System.out.print("Node "+(i+1)+" :- ");
			for(int j=0;j<nodes[i].adjNode.size();j++){
				System.out.print(" "+nodes[i].adjNode.get(j));
			}
			System.out.println();
		}
		int head = sc.nextInt();
		boolean visited[] = new boolean[node];
		
		DFS(nodes,head,visited);
		
		System.out.println(node-count);
	}
}