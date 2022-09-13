package com.te.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Amit");
		map.put(2,"Amir");
		map.put(3,null);
		map.put(null,"something");
		map.put(null,"Aman");
		
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> iterator=keySet.iterator();
		while (iterator.hasNext()) {
			Integer key=(Integer) iterator.next();
			System.out.println(key+"::"+map.get(key));
					
		}
		
		
	}

}
