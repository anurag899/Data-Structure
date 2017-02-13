import java.util.*;
class Node{
	List<Map<Integer,Integer>> adjNode = new ArrayList<Map<Integer,Integer>>();
}
class Heap{
	List<Map<Integer,Integer>> al = new ArrayList<Map<Integer,Integer>>();
	int parent(int i){
		return (i-1)/2;
	}
	int left(int i){
		return (2*i+1);
	}
	int right(int i){
		return (2*i+2);
	}
	void minHepify(int i){
		int left=left(i);
		int right = right(i);
		int smallest = i;
		if(left<al.size() && al.get(left) < al.get(i)){
			smallest = left;
		}
		if(right < al.size() && al.get(right) < al.get(smallest)){
			smallest = right;
		}
		if(smallest!=i){
			Collections.swap(al,smallest,i);
			minHepify(smallest);
		}
	}
	int extractMin(){
		if(al.size()<=0){
			return Integer.MAX_VALUE;
		}
		if(al.size()==1){

			return al.get(0);
		}
		int root = al.get(0);
		Collections.swap(al,0,al.size() -1);
		minHepify(0);
		return root;
	}
	void insertkey(int k){
		int i=al.size()-1;
		al.add(k);
		while(i!=parent(i) && al.get(i) <al.get(parent(i))){
			Collections.swap(al,i,parent(i));
			i=parent(i); 
		}
	}
}

class wcreateGraph{
	public static void main(String... a){
		Scanner sc= new Scanner(System.in);
		int node = sc.nextInt();
		int edge = sc.nextInt();
		Node[] nodes = new Node[node];
		for(int i=0;i<node;i++){
			nodes[i] = new Node();
		}
		for(int i=0;i<edge;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int w=sc.nextInt();
			Map<Integer,Integer> m = new HashMap<Integer,Integer>();
			m.put(y,w);
			nodes[x-1].adjNode.add(m);
		}
		for(int i=0;i<node;i++){
			System.out.print("Node "+(i+1)+" :- ");
			for(Map m:nodes[i].adjNode){
				Set set=m.entrySet();//Converting to Set so that we can traverse  
	    		Iterator itr=set.iterator();  
    			while(itr.hasNext()){  
	        		//Converting to Map.Entry so that we can get key and value separately  
	        		Map.Entry entry=(Map.Entry)itr.next();  
	        		System.out.print("("+entry.getKey()+","+entry.getValue()+") ");
			}
			
		}
		System.out.println();
	}
	}
}