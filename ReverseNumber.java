package com.java.practice21;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0, rem=0;
        int copy=n; //temp
        while(copy>0) {
        	rem=copy%10;
        	rev=rev*10+rem;
        	copy=copy/10;
        }
        System.out.println("reverse of given number "+n+" is "+rev);
	}

}
