package com.java.practice21;
import java.util.*;

public class CountVowel {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int count=0;
	str = str.toLowerCase(); // CONVERTING into lower case other wise we have to check it for both cases
		for(int i=0; i<len;i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("count of vowels in given string is: "+count);
	}
 
}
