package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sockingparing {

	public static void main(String[] args) {
		Integer[] arr = { 6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5 };
		List<Integer> arrList = Arrays.asList(arr);
		//2nd way to convert array to List
		//Collections.addAll(arrList, arr);
		//3rd way
		//Arrays.stream(arr).collect(Collectors.toList());
		
		int a=Socks.socksPair(arr.length,arrList);
		System.out.println("pairs is = "+a);
	}

}

class Socks{
	public static int socksPair(int n,List<Integer> ar) {
		int pairs=0;
	    Map<Integer, Integer> mapList = new HashMap<Integer, Integer>();
	        for(int i=0;i<ar.size();i++) {
	            if(mapList.containsKey(ar.get(i)))
	            {
	                int count = mapList.get(ar.get(i));
	                mapList.put(ar.get(i), ++count);
	            }else {
	                mapList.put(ar.get(i), 1);
	            }
	        }
	        
	        
	         for(Integer value:mapList.values()) {
	             pairs = pairs + (value/2);
	         }
	    return pairs;
	    
	    }
		
	}



/*
 * for (int i = 0; i < len; i++) { for (int j = 0; j < len; j++) { if (arr[j] <
 * arr[i]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } } } for (int i =
 * len-1; i >= 0; i--) { System.out.print(arr[i]+ " "); }
 */