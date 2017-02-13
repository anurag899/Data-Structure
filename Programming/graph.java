import java.util.*;
class graph{
	private static final int numNode=5;
	static void DFS(List<List<Integer>> G,int i){
		Stack<Integer> st = new Stack<Integer>();
		boolean visited[] = new boolean[numNode];
		st.push(i);
		visited[i-1]=true;
		while(!st.empty()){
			int v = st.peek();
			st.pop();
			System.out.println(v);
			for(int j=0;j<G.get(v-1).size();j++){
				if(!(visited[G.get(v-1).get(j)-1]))
					st.push(G.get(v-1).get(j));
					visited[G.get(v-1).get(j)-1]=true;
			}
		}

	}
	static void RecuDFS(List<List<Integer>> G,int i){}
	public static void main(String[] t){
		Scanner sc  = new Scanner(System.in);
		List<List<Integer>> node = new ArrayList<List<Integer>>();
		for(int i=0;i<numNode;i++){
			List<Integer> adjNode = new ArrayList<Integer>();
			int adjNo  = sc.nextInt();
			for(int j=0;j<adjNo;j++){
				int insertNode=sc.nextInt();
				adjNode.add(insertNode);
			}
			node.add(adjNode);}
		DFS(node,1);
		//System.out.println(node.get(0).size());
	}	
}