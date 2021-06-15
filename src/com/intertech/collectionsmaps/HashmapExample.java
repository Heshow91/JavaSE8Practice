package com.intertech.collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.acme.utils.MyDate;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// time to use Hashmap is when doing a lot of random access  
		Map<String, MyDate> map = new HashMap<>();
		
		MyDate birthday = new MyDate(10,1,1991);
		MyDate anniversary = new MyDate(11,2,2019);
		MyDate HBDay = new MyDate(1,23,2009);
		MyDate random = new MyDate(1,1,1001);
		
		map.put("My BirthDay ", birthday);
		
		map.put("Anniversary ", anniversary);
		
		map.put("Hanas BDay ", HBDay);
		
		map.put("Something Random", random);
		
		MyDate d = (MyDate)map.get("birthday");
		System.out.println(d);
		
		// wont remove it because it needs to be the key not object
		map.remove(random);
		map.remove("Something Random");
		
		//System.out.println(map);
		
		if(map.containsKey("Hanas BDay")) {
			System.out.println("Hanas Birthday is a key in the map");
		}
		if(map.containsValue(anniversary)) {
			System.out.println("My anniversary date is a value in the map");
		}
		System.out.println(map);
		Set<String> s = map.keySet();
		System.out.println(s);
		Collection<MyDate> c = map.values();
		System.out.println(c);
		map.clear();
		System.out.println(map + " empty");
		
		// why one returns a set and one returns a collection 
		// keys have to be unique cannot reuse the key and a set returns keys
		// collections returns the value of objects in the map
			
		}
	}
