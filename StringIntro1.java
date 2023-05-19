package com.string;

import java.util.Scanner;

public class StringIntro1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 string");
		String A = sc.next();
		String B = sc.next();
		//boolean flag = false ;
		int length = A.length()+B.length();
        System.out.println(length);
        int flag=1;
        if(A.compareTo(B) > 1){
            System.out.println("Yes"); 
        }
        else {
            System.out.println("No");   
        }
        System.out.println((A.substring(0,1).toUpperCase())
        		.concat(A.substring(1)).concat(" ")
        		.concat(B.substring(0,1).toUpperCase().concat(B.substring(1))));
	}

}
