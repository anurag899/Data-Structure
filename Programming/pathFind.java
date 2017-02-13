import java.util.*;
class Node{
	ArrayList<Integer> adjNode=new ArrayList<Integer>();
}
class pathFind{
	static void DFS(Node[] node,int u,int k,boolean[] visited,Stack<Integer> path){
		visited[u-1]=true;
		path.push(u);
		if(u==k){
			for(Integer i:path){
				System.out.print(i+"->");
				}
			System.out.print("\b");	
			System.out.println();
			}
		
		else{
			for(int i=0;i<node[u-1].adjNode.size();i++){
				int t=node[u-1].adjNode.get(i);
				if(!visited[t-1]){
					visited[t-1]=true;
					DFS(node,t,k,visited,path);
				}
			}
		}
		path.pop();
		visited[u-1]=false;
	}
	public static void main(String... a){
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
		Stack<Integer> path = new Stack<Integer>();
		DFS(nodes,1,5,visited,path);
	}
}