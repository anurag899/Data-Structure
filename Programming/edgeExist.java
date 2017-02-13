import java.util.*;
class Node{
	List<Integer> adjNode = new ArrayList<Integer>();
}
class edgeExist{
	public static void main(String... m){
		Scanner in = new Scanner(System.in);
		int nodes=in.nextInt();
		int edge=in.nextInt();
		Node[] node= new Node[nodes];
		for(int i=0;i<nodes;i++){
			node[i]=new Node();
		}
		for(int i=0;i<edge;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			node[a-1].adjNode.add(a);
			node[b-1].adjNode.add(b);
			node[a-1].adjNode.add(b);
			node[b-1].adjNode.add(a);
		}
		int q=in.nextInt();
		while(q-->0){
			int a=in.nextInt();
			int b=in.nextInt();
			if(node[a-1].adjNode.contains(b)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}