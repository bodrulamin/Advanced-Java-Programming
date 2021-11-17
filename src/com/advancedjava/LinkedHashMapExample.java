package com.advancedjava;

import com.advancedjava.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(2, 0.75f, false);

		phoneBook.put("Rakib", 12548);
		phoneBook.put("Sakib", 15548);
		phoneBook.put("Bodrul", 12548);
		phoneBook.put("Nayeem", 12);

		System.out.println("Bodrul's Phone " + phoneBook.get("Bodrul"));

	
		for(Map.Entry<String,Integer> entry: phoneBook.entrySet()){
			String key =entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + " value: " + value);
		}

		
	}

}
