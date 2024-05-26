package com.java.practice21;
import java.util.*;
public class PowerOfNumber {

	public static void main(String[] args) {
		// finding m^n
		System.out.println("enter m & n");
         Scanner sc=new Scanner(System.in);
         int m=sc.nextInt();
         int n=sc.nextInt();
         int mul=1;
         for(int i=1;i<=n;i++) {
        	 mul=mul*m;
         }
         System.out.println("m^n is: "+mul);
	}

}
