package com.practice;

import java.util.Scanner;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers as Array Elements:");
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int j=0;j<a.length;j++) {
			
			sum+=a[j];
			
			int[] b = new int[a.length];
			b[j]=a[j];
			
			
			if(sum==0) {
			
				for(int x=0; x<=j;x++)
				System.out.print(b[x]+", ");
				
			}
			
			
		}
		
		
		
	}
}
