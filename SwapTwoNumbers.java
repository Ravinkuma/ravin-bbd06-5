package com.java.practice21;
import java.util.*;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("enter the value of a and b");
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("swapped numer is: a = "+a+" & b = "+b);
	}

}
// i think third variable used like int c=a+b; a=c-a; & b=c-a;  