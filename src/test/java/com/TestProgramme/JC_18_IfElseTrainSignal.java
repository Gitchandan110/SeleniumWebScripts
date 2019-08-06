package com.TestProgramme;

public class JC_18_IfElseTrainSignal {

	public static void main(String[] args) {
		
		
		String Green = null;
		String Red = null;
		String Yellow =null;
		String signal;
		signal=Green;
		if (signal==Green) {
		System.out.println("Train Running");
		}
		
		else if (signal==Red){
			
			System.out.println("Train Stop");
		}
         
		else if (signal==Yellow){
			
			System.out.println("Train about to Run");
		}
		
		else {
			
			System.out.println("Train Status is unknown");
		}
			
	}

}
