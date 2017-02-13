import java.util.*;
class list{
	public static void main(String... a){
		List<Map<Integer,String>> list = new ArrayList<Map<Integer,String>>();
		list.add(new HashMap<Integer,String>().put(1,"Ram"));
		list.add(new HashMap<Integer,String>().put(2,"Ram"));
		list.add(new HashMap<Integer,String>().put(3,"Ram"));
		list.add(new HashMap<Integer,String>().put(4,"Ram"));
		list.add(new HashMap<Integer,String>().put(5,"Ram"));
		for(Map m:list){
			Set s= m.entrySet();
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				Map.Entry entry=(Map.Entry)itr.next();  
	        	System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}