package com.demo.class1;

import java.util.Scanner;

public class DemoClass1
{

	public static void main (String[] args)
	{
		
	          int Temp ;
	     
	      System.out.println (" Please enter any temperature ");
	      
	       Scanner sc = new Scanner(System.in);
	          Temp = sc.nextInt ();
		
		if (Temp <= 100) {
			System.out.println ( "Stay inside it's too hot   ");
		
		} else if  (Temp >= 50 && Temp <= 99) {
			  System.out.println ( " Wear winter clothes");
		
		}else if (Temp >= 30 && Temp <= 49) {
			System.out.println (" Wear extra underpants ");
		
		}else if (Temp >10 && Temp <= 29) {
			System.out.println (" Stay inside it's too cold");
		
		} else {
			System.out.println (" Call for help it's too cold outside");
		
		}
			 
	  
		
	}
	
}
