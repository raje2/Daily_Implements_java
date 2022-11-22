package com.masai;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		String str = "Badal";
		
		
		
		char[] c = str.toCharArray();
		
		for(Character i:c) {
			
			if(hm.get(i)==null) {
				hm.put(i, 1);
			}
			else {
				hm.put(i, hm.get(i)+1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> j:hm.entrySet()) {
			
			System.out.println(j.getKey()+" "+j.getValue());
		}
		//System.out.println(hm.get('a'));
		
		
		
	}

}
