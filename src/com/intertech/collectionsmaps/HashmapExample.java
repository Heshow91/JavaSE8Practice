package com.intertech.collectionsmaps;

import java.util.HashMap;
import java.util.Map;

import com.acme.utils.MyDate;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap<>();
		
		MyDate birthday = new MyDate(10,1,1991);
		MyDate anniversary = new MyDate(11,2,2019);
		MyDate HBDay = new MyDate(1,23,2009);
		MyDate random = new MyDate(1,1,1001);
		
		map.put("My BirthDay ", birthday);
		
		map.put("Anniversary ", anniversary);
		
		map.put("Hanas BDay ", HBDay);
		
		map.put("Something Random", random);
		
		MyDate d = (MyDate)map.get("birthday");
		
		map.remove("Something Random");
		
		System.out.println(map);
			
		}
	}
