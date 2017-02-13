import java.util.*;
class Node{
	ArrayList<Integer> adjNode=new ArrayList<Integer>();
}
class maxPath{
	static int min=9999;
	static ArrayList<Integer> pathValue=new ArrayList<Integer>();;
	static int w;
	static void DFS(Node[] node,int u,int k,boolean[] visited,Stack<Integer> path){
		visited[u-1]=true;
		path.push(u);
		if(u==k){
			int value=path.size();
			pathValue.add(value-1);
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
		edges= node-1;
		boolean visited[] = new boolean[node];
		Node[] nodes = new Node[node];
		for(int i=0;i<node;i++){
			nodes[i]=new Node();
		}
		for(int i=0;i<edges;i++){
			int x= sc.nextInt();
			int y= sc.nextInt();
			nodes[x-1].adjNode.add(y);
			nodes[y-1].adjNode.add(x);
		}
		Stack<Integer> path = new Stack<Integer>();
		int Q=sc.nextInt();
		int girls[] = new int[Q];
		for(int i=0;i<Q;i++){
			girls[i]=sc.nextInt();
			DFS(nodes,1,girls[i],visited,path);
		}
		for(Integer pathV:pathValue)
				System.out.println(pathV);
		int min=pathValue.get(0);
		int minI=girls[0];
		for(int i=1;i<pathValue.size();i++){
			if(min>pathValue.get(i)){
				min=pathValue.get(i);
				minI=girls[i];
			}
		}
		System.out.println("minimum distance "+(minI));
	}
}