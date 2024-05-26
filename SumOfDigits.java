package com.java.practice21;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one or more digits number");
         int n=sc.nextInt();
         int rem=0;
         int sum=0;
         while(n>0) {
        	 rem=n%10;
        	 sum=sum+rem;
        	 n=n/10;
         }
         System.out.println("sum of digits of given number is: "+sum);
	}

}
