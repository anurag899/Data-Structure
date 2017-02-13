import java.util.*;
class Node{
	List<Integer> adjNode = new ArrayList<Integer>();
}
class monkLearn{
	private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/


        return sortedMap;
    }
	public static void main(String... m){
		Scanner in = new Scanner(System.in);
		int nodes = in.nextInt();
		int edge = in.nextInt();
		int k=in.nextInt();
		int[] vnode = new int[nodes];
		for(int i=0;i<nodes;i++){
			vnode[i] = in.nextInt();
		}
		Node[] node = new Node[nodes];
		for(int i=0;i<nodes;i++){
			node[i]=new Node();
		}
		for(int i=0;i<edge;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			node[a-1].adjNode.add(b);
			node[b-1].adjNode.add(a);
		}
		for(int i=0;i<nodes;i++){
			Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
			for(Integer n:node[i].adjNode){
				temp.put(n,vnode[n-1]);
			}
			Map<Integer,Integer> temp1 = sortByValue(temp);
			System.out.println(temp1);
			Set set=temp1.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator(); 
		    int q=0;
		    // while(itr.hasNext()){  
		    //     //Converting to Map.Entry so that we can get key and value separately  
		    //     Map.Entry entry=(Map.Entry)itr.next();
		    //     if(q==k-1){
		    //     	System.out.println(entry.getKey());
		    //     	break;}
		    //       q++;
		          
		    // }  
		}
	}
}