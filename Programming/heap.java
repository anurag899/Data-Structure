import java.util.*;
class Heap{
	ArrayList<Integer> al = new ArrayList<Integer>();
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
	public static void main(String... a){
		Heap h = new Heap();
		h.insertkey(12);
		h.insertkey(4);
		h.insertkey(5);
		h.insertkey(69);
		h.insertkey(9);
		h.insertkey(18);
		System.out.println(h.extractMin());
	}TY
}