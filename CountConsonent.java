package com.java.practice21;

import java.util.Scanner;

public class CountConsonent {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int count=0;
	    str = str.toLowerCase();
		for(int i=0; i<len;i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				//count=0; it will make earlier count as zero(consonent count till loop will be zero)
				count=count+0;
			} else {
				count++;
			}
		}
		System.out.println("count of consonent in given string is: "+count);

	}

}
