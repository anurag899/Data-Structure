import java.util.*;
class pqueue{
	public static void main(String... a){
		class MyComparator implements Comparator<Integer>
		{
		    public int compare( Integer x, Integer y )
		    {
		        if(x>y){  
			        return 1;  
			    }else if(x<y){  
			        return -1;  
			    }else{  
			    	return 0;  
			    } 
		    }
		}
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(39);
		pq.add(31);
		pq.add(1);
		pq.add(73);
		pq.add(32);
		Iterator i = pq.iterator();
		// while(i.hasNext()){
		// 	System.out.println(i.next());
		// }
		// for(int j=0;j<pq.size();j++){
		// 	System.out.println(pq.poll());
		// }
	
	}
}