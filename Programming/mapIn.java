import java.util.*;
class mapIn{
	public static void main(String... a){
		// List<Map<Integer,String>> al = new ArrayList<Map<Integer,String>>();
		// al.add(new HashMap<Integer,String>().put(1,"Ram"));
		// al.add(new HashMap<Integer,String>().put(2,"Shyam"));
		// al.add(new HashMap<Integer,String>().put(3,"Shyam"));
		// Map<Integer, String> map1 = new HashMap<Integer, String>();
  //   map1.put(1, "Josh");

  //   Map<Integer, String> map2 = new HashMap<Integer, String>();
  //   map2.put(2, "Anna");

  //   Map<Integer, String> map3 = new HashMap<Integer, String>();
  //   map3.put(3, "Bernie");

    List<Map<Integer, String>> mapList = new ArrayList<Map<Integer, String>>();
  //   // mapList.add(map1);
  //   // mapList.add(map2);
  //   // mapList.add(map3);
    mapList.add(new HashMap<Integer,String>(){put(1,"Ram");});
		mapList.add(new HashMap<Integer,String>(){put(2,"Shyam");});
		mapList.add(new HashMap<Integer,String>(){put(3,"Shyam");});
		// for(int i=0;i<4;i++){
		// 	Map<Integer,String> map=new HashMap<Integer,String>();
		// 	map.put(i,"Ram");
		// 	mapList.add(map);
		// }
		for(Map m:mapList){
			// for(Map.Entry e:m.entrySet()){
			// 	System.out.println(e.getKey()+" "+e.getValue());
			// }
    	   Set set=m.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    		while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    } 
		}
	}
}