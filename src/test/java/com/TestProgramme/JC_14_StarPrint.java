package com.TestProgramme;

public class JC_14_StarPrint {

	public static void main(String[] args) {
		

     pattern(0,0);
		
		
	}
	
	
	public static void pattern(int i, int j) {
		
		for (i=0; i<=j; i++) {
			
			for (j=0; j<=i; j++)
			
			System.out.print("*");
			
			System.out.println();
			
			
			
		}
	}

}
